package com.example.Student.CRUD.Operation.REPOSITORY;

import com.example.Student.CRUD.Operation.ENTITY.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, String> {

}
