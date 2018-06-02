package com.abg.max.rest;

import com.abg.max.dao.StudentDao;
import com.abg.max.entity.Student;
import com.abg.max.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    //private List<Student> theStudents;

//    @PostConstruct
//    public void loadData(){
//
//        theStudents = new ArrayList<>();
////
////        theStudents.add(new Student("John", "Cool"));
////        theStudents.add(new Student("Mary", "Lee"));
////        theStudents.add(new Student("Tom", "Sailor"));
//    }


    // "/students" endpoint
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

//    // "/students/{studentId}" endpoint
//    @GetMapping("/students/{studentId}")
//    public Student getStudent(@PathVariable int studentId){
//        return theStudents.get(studentId);
//    }

}
