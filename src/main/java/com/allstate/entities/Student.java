package com.allstate.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="students")
@Data
public class Student {
    private int id;
    private int version;
    private String email;
    private Date created;
    private Date modified;

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



}
