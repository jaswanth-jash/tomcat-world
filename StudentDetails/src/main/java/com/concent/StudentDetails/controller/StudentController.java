package com.concent.StudentDetails.controller;

import com.concent.StudentDetails.model.Student;
import com.concent.StudentDetails.model.Student1;
import com.concent.StudentDetails.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepo studentRepo;


    @RequestMapping("/")
    public String home(){
        return "welcome";
    }
    @RequestMapping("/save")

    public String save(Student1 student1)
    {
        studentRepo.save(student1);
        return "save";
    }

    @RequestMapping("/display")
    public ModelAndView display(ModelAndView modelandView)
    {
        List<Student1> allStudents = (List<Student1>) studentRepo.findAll();
        modelandView.addObject("allStudents",allStudents);
        modelandView.setViewName("display");
        return modelandView;
    }

}
