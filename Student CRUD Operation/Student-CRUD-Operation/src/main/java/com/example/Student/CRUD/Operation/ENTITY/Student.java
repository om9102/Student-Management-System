package com.example.Student.CRUD.Operation.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    String kodId;
    String name;
    String branch;

    public Student() {
    }

    public Student(String kodId, String name, String branch) {
        this.kodId = kodId;
        this.name = name;
        this.branch = branch;
    }


    @Override
    public String toString() {
        return "Student{" +
                "kodId='" + kodId + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }


    public String getKodId() {
        return kodId;
    }

    public void setKodId(String kodId) {
        this.kodId = kodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
