package com.example.assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    private StudentRepository repository;




    private static final Logger LOG = LogManager.getLogger(controller.class);





    @PostMapping("/id/{id}")
    public response retrieveExchangeValue(@PathVariable int id) {
        LOG.info("request id -> {}",System.currentTimeMillis());
        student s = repository.findById(id);
        response response = new response(s.getId(), s.getName(), s.getAge(), new marks(s.getPhysics(), s.getChem()),s.getDiv(),s.getCollege());
        return response;
    }
}
