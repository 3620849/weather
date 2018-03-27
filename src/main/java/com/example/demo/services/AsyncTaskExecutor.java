package com.example.demo.services;

import com.example.demo.model.Task;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.Future;

/**
 * Created by UA C on 18.02.2018.
 */
@Service
public class AsyncTaskExecutor {
    @Async
    Future<Boolean> execute(Task task){
        task.execute();
        return new AsyncResult<>(true);
    }
}
