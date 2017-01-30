package com.allstate.services;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class TeacherServiceTest {

    @Autowired
    private TeacherService teacherservice;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateTeachers() throws Exception{

        Teacher before = new Teacher();
        before.setName("Parag");
        before.setAge(40);
        before.setGender(Gender.M);
        Teacher after = this.teacherservice.create(before);
        assertEquals(0, after.getVersion());
        assertEquals("Parag", after.getName());
    }

    @Test
    public void shouldFindTeacherById() throws Exception{

        Teacher before = this.teacherservice.findById(1);
        assertEquals("Teacher1",before.getName());
    }

    @Test
    public void shouldNotFindTeacherById() throws Exception{

        Teacher after = this.teacherservice.findById(5);;
        assertNull(after);
    }


    @Test
    public void shouldFindAllTeacherByGender() throws Exception{

        ArrayList<Teacher> t = (ArrayList<Teacher>) this.teacherservice.findByGender(Gender.M);
        assertEquals(3,t.size());
    }

    @Test
    public void shouldFindAllTeacherByCertainAge() throws Exception{

        ArrayList<Teacher> t = (ArrayList<Teacher>) this.teacherservice.findByAgeGreaterThanEqual(25);
        assertEquals(4,t.size());
    }

    @Test
    public void shouldNotFindAllTeacherByCertainAge() throws Exception{

        ArrayList<Teacher> t = (ArrayList<Teacher>) this.teacherservice.findByAgeGreaterThanEqual(61);
        assertEquals(0,t.size());
    }

    @Test
    public void shouldFindAllKlassesTaughtByATeacher() throws Exception{

        List<String> list = this.teacherservice.getAllKlasses(1);
        assertEquals(2, list.size());
    }

}