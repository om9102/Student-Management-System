package com.example.Student.CRUD.Operation.API;


import com.example.Student.CRUD.Operation.ENTITY.Student;
import com.example.Student.CRUD.Operation.SERVICES.StudentServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@RestController
@RequestMapping("/stud")
public class StudentController {
    StudentServices ss;
    public StudentController(StudentServices ss){
        this.ss = ss;
    }






    @PostMapping
    public String AddStudent(@RequestBody Student s){
      String msg =  ss.AddStudent(s);
        return msg;
    }


    @GetMapping(value = "{kodId}")
    public Student getStudent(@PathVariable("kodId") String kodId){
        return  ss.getStudent(kodId);
    }


    @GetMapping(value = "/all")
    public List<Student> getAllStudents( ){
        return  ss.getAllStudents();
    }



    @PutMapping
   public String updateStudent(@RequestBody Student s){
        return  ss.updateStudent(s);
   }



   @DeleteMapping(value = "{kodId}")
   public String deleteStudent(@PathVariable("kodId") Student kodId){
        String delete = ss.deleteStudent(kodId);
        return delete;
   }



}*/
