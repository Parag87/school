package com.allstate.entities;

import com.allstate.enums.Department;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="klasses")
public class Klass {

    private int id;
    private int version;
    private String name;
    private Date semester;
    private Enum department;
    private Double fee;
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



    @Column(nullable = false, columnDefinition = "ENUM('SCIENCE', 'ENGINEERING', 'LITERATURE', 'PHILOSOPHY')")
    @Enumerated(EnumType.STRING)
    public Enum getDepartment() {
        return department;
    }

    public void setDepartment(Enum department) {
        this.department = department;
    }
}
