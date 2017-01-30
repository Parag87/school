package com.allstate.services;

import com.allstate.entities.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class StudentServiceTest {

    @Autowired
    private StudentService studentservice;



    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateStudent() throws Exception{
        Student before = new Student();
        //before.setEmail();
        before.setEmail("tiru@allstate.com");
        Student after = this.studentservice.create(before);
        assertEquals(0, after.getVersion());
        assertEquals("tiru@allstate.com", after.getEmail());
    }


    @Test
    public void shouldFindStudentByID() throws Exception{
        Student before = new Student();
        before.setEmail("tiru@allstate.com");
        Student after = this.studentservice.create(before);
        Student s = this.studentservice.findById(2);
        assertEquals("tiru@allstate.com",s.getEmail());
    }

    @Test
    public void shouldNotFindStudentByWrongID() throws Exception{
        Student before = new Student();
        before.setEmail("tiru@allstate.com");
        Student after = this.studentservice.create(before);
        Student s = this.studentservice.findById(5);
       assertNull(s);
    }

    @Test
    public void shouldFindStudentByEmail() throws Exception{
        Student s = this.studentservice.findByEmail("test@gmail.com");
        assertEquals("test@gmail.com",s.getEmail());
    }

    @Test
    public void shouldNotFindStudentByWrongEmailID() throws Exception{
        Student s = this.studentservice.findByEmail("aaa@gmail.com");
        assertNull(s);
    }


}