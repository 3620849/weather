package com.example.demo.services;

import com.example.demo.dao.ForecastRequestRepository;
import com.example.demo.dao.ForecastResponseRepository;
import com.example.demo.model.ForecastRequest;
import com.example.demo.model.ForecastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class ForecastService {
    Lock lock = new ReentrantLock();
    @Autowired
    ForecastRequestRepository forecastRequestRepository;
    @Autowired
    ForecastResponseRepository forecastResponseRepository;
    @Autowired
    AsyncTaskExecutor asyncTaskExecutor;
    @Autowired
    ResponseService restService;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void storeForecastRequest(ForecastRequest forecastRequest) {
        forecastRequestRepository.save(forecastRequest);
    }


    public ResponseEntity run() {

            List<ForecastRequest> requestList = forecastRequestRepository.findByExecuted(false);
            List<Future> futureResponses = new ArrayList<>();
            for(ForecastRequest req: requestList){

                Future<Boolean> future = asyncTaskExecutor.execute(()->{
                    try {
                        req.setExecuted(true);
                        forecastRequestRepository.save(req);
                        restService.fetchResponse(req);
                    }catch (OptimisticLockingFailureException e){
                        System.out.println("Enother thread already change this entity");
                    }
                });
                futureResponses.add(future);
                for(Future task : futureResponses){
                    try {
                        task.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        return new  ResponseEntity(forecastResponseRepository.findAll(), HttpStatus.OK);
    }
}
