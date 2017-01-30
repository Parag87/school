package com.allstate.entities;

import com.allstate.enums.Department;
import com.allstate.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="teachers")
@Data
public class Teacher {

    private int id;
    private int version;
    private String name;
    private int age;
    private Gender gender;


    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Column(nullable = false, columnDefinition = "ENUM('M' , 'F')")
    @Enumerated(EnumType.STRING)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }



}
