package com.anandan.mongo.demomongo.service;

import com.anandan.mongo.demomongo.entity.MyData;
import com.anandan.mongo.demomongo.repo.MyDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyDataService {

    @Autowired
    private MyDataRepo myDataRepo;

    public MyData save(MyData myData) {
        return myDataRepo.save(myData);
    }

    public List<MyData> getAll() {
        return myDataRepo.findAll();
    }

    public Optional<MyData> get(String id) {
        return myDataRepo.findById(id);
    }
}
