package com.example.Student.CRUD.Operation.SERVICES;

import com.example.Student.CRUD.Operation.ENTITY.Student;
import com.example.Student.CRUD.Operation.REPOSITORY.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentServices {

      StudentRepository srepo;
      public StudentServiceImplementation(StudentRepository srepo){
          this.srepo = srepo;
      }


    @Override
    public String AddStudent(Student s) {
          srepo.save(s);
        return "Student Added Successfully";
    }

    @Override
    public Student getStudent(String kodId) {
       Student st =    srepo.findById(kodId).get();
        return st;
    }

    @Override
    public List<Student> getAllStudents() {
         List<Student>  slist = srepo.findAll();
        return slist;
    }

    @Override
    public String updateStudent(Student s) {
          srepo.save(s);
        return "Student Updated";
    }

    @Override
    public String deleteStudent(Student kodId) {
          srepo.delete(kodId);
        return "Student Deleted Successfully !";
    }

    
       /*@Override
    public String deleteStudent(Student kodId) {
          srepo.delete(kodId);
        return "Student Deleted Successfully !";
    }*/
}
