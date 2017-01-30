package com.allstate.services;

import com.allstate.entities.Klass;
import com.allstate.repositories.IKlassRepository;
import com.allstate.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KlassService {
    @Autowired
    private IKlassRepository repository;

    @Autowired
    public void setKlassRepository(IKlassRepository repository)
    {
        this.repository = repository;
    }

    public Klass create(Klass s) {
        return this.repository.save(s);
    }

    public Klass findById(int id){
        return this.repository.findOne(id);
    }
    public Klass findByName(String name){
        return this.repository.findByName(name);
    }
}
