package com.example.Student.CRUD.Operation.SERVICES;

import com.example.Student.CRUD.Operation.ENTITY.Student;

import java.util.List;

public interface StudentServices {
    String AddStudent(Student s);
    Student getStudent(String kodId);
    List<Student> getAllStudents();
    String updateStudent(Student s);
    String deleteStudent(Student kodId);
}
