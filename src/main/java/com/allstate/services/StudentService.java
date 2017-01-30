package com.allstate.services;

import com.allstate.entities.Student;
import com.allstate.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository repository;

    @Autowired
    public void setStudentRepository(IStudentRepository repository)
    {
        this.repository = repository;
    }
    public Student create(Student s) {
        return this.repository.save(s);
    }
}
