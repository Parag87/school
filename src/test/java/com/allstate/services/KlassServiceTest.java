package com.allstate.services;

import com.allstate.entities.Klass;
import com.allstate.enums.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.sql.Timestamp;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class KlassServiceTest {

    @Autowired
    private KlassService klassservice;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateKlass() throws Exception{
        Date date = new Date();

        Klass before = new Klass();
        before.setName("Maths");
        before.setDepartment(Department.SCIENCE);
        before.setFee(120.20);
        before.setSemester(new Timestamp(date.getTime()));
        Klass after = this.klassservice.create(before);
        assertEquals(0, after.getVersion());
        assertEquals("Maths", after.getName());
    }

    @Test
    public void shouldNotFindKlassById() throws Exception{
        Klass k = this.klassservice.findById(3);
        assertNull(k);
    }

    @Test
    public void shouldCreateKlassWithName() throws Exception{
        Date date = new Date();

        Klass before = new Klass();
        before.setName("Compozed");
        before.setDepartment(Department.ENGINEERING);
        before.setFee(500000.00);
        before.setSemester(new Timestamp(date.getTime()));
        Klass after = this.klassservice.create(before);
        assertEquals(0, after.getVersion());
        assertEquals("Compozed", after.getName());
    }

    @Test
    public void shouldFindKlassWithName() throws Exception{

        Klass after = this.klassservice.findByName("Compozed");
        // assertEquals(0, after.getVersion());
        assertEquals("Compozed", after.getName());
    }

    @Test
    public void shouldNotFindKlassWithName() throws Exception{
        Klass after = this.klassservice.findByName("Compozed123");
        assertNull(after);
    }
}