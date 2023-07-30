package com.vaccination.vaccinate.Serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination.vaccinate.Model.Modeluser;
import com.vaccination.vaccinate.Repository.Repouser;

@Service
public class Userservice {

    @Autowired
    Repouser repository;

    public void Add(Modeluser use) {
        repository.save(use);
    }

    public List<Modeluser> findAll() {
        return repository.findAll();
    }

}
