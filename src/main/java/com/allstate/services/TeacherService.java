package com.allstate.services;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import com.allstate.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private ITeacherRepository repository;

    @Autowired
    public void setTeacherRepository(ITeacherRepository repository)
    {
        this.repository = repository;
    }
    public Teacher create(Teacher t) {
        return this.repository.save(t);
    }

    public Teacher findById(int id){
        return this.repository.findOne(id);
    }

    public  Iterable<Teacher> findByGender(Gender gender){
        return this.repository.findByGender(gender);
    }
    public Iterable<Teacher>  findByAgeGreaterThanEqual(int age){
        return this.repository.findByAgeGreaterThanEqual(age);
    }

    public List<String> getAllKlasses(int userId){
        return this.repository.getAllKlasses(userId);
    }
}
