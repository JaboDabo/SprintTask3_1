package kz.bitlab.springboot.techboot.controller;


import kz.bitlab.springboot.techboot.db.DBManager;
import kz.bitlab.springboot.techboot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model) {

        ArrayList<Student> studentArray = DBManager.getStudents();
        model.addAttribute("balalar", studentArray);
        return "index";
    }

    @GetMapping(value = "/add-student")
    public String AddStudent() {
        return "addStudent.html";
    }

    @PostMapping(value = "/add-student")

    public String AddStudent(Student student) {
        DBManager.addStudent(student);
        return "redirect:/";
    }



}