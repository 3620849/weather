package com.example.demo.dao;

import com.example.demo.model.ForecastRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by UA C on 18.02.2018.
 */
@Repository
public interface ForecastRequestRepository extends MongoRepository<ForecastRequest,String>{
    List<ForecastRequest> findByExecuted(boolean executed);
}
