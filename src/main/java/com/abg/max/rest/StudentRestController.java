package com.abg.max.rest;

import com.abg.max.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    // "/students" endpoint
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("John", "Cool"));
        theStudents.add(new Student("Mary", "Lee"));
        theStudents.add(new Student("Tom", "Sailor"));

        return theStudents;
    }

}
