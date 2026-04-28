package com.example.Student.CRUD.Operation.API;


import com.example.Student.CRUD.Operation.ENTITY.Student;
import com.example.Student.CRUD.Operation.SERVICES.StudentServices;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebStudentController {

    StudentServices ss;

    public WebStudentController(StudentServices ss) {
        this.ss = ss;
    }


    // Home Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Open Add Page
    @GetMapping("/add")
    public String addPage() {
        return "add";
    }


    //Open View Page
    @GetMapping("/vp")
    public String viewpage() {
        return "view";
    }


    //Open Update Page
    @GetMapping("/up")
    public String updatepage() {
        return "update";
    }

    @GetMapping("/d")
    public String deleteStudent() {
        return "delete";
    }





    /*@PostMapping("/addstudent")
    public String addStudent(@RequestParam("kodId") String kodId ,
                             @RequestParam("name") String name,
                             @RequestParam("branch") String branch ){

        Student s = new Student(kodId , name , branch);
        ss.AddStudent(s);
        return "redirect:/";
    }*/


    @PostMapping("/addstudent")
    public String addStudent(@ModelAttribute Student s, Model model) {

        if (s != null) {

            ss.AddStudent(s);

            model.addAttribute("message", "Students Added Successfully!");
        } else {
            model.addAttribute("message", "Student Not Added");
        }
        return "result";

    }


    @PutMapping("/updstud")
    public String updateStudent(@ModelAttribute Student s, Model model) {

        Student st = ss.getStudent(s.getKodId());

        if (st != null) {

            st.setName(s.getName());
            st.setBranch(s.getBranch());
            ss.updateStudent(st);


            model.addAttribute("message", "Students updated Successfully!");
        } else {
            model.addAttribute("message", "Student Id Not Found!");
        }

        return "result";
    }


    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam String kodId, Model model) {

        Student s = ss.getStudent(kodId);

        if (s != null) {

            ss.deleteStudent(s);
            model.addAttribute("message", "Student Deleted Successfully");

        } else {
            model.addAttribute("message", "Student Not Deleted!");
        }

        return "result";
    }


    @GetMapping("/get")
    public String viewStudent(@RequestParam String kodId, Model m) {
        Student st = ss.getStudent(kodId);

        if (st != null) {

            m.addAttribute("student", st);

        } else {
            m.addAttribute("message", "Student Not found");
        }


        return "result";
    }


    @GetMapping("/students")
    public String viewAllStudent(Model model) {

        List<Student> slist = ss.getAllStudents();

        model.addAttribute("students", slist);

        return "students";
    }


}
