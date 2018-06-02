package com.abg.max.service;

import com.abg.max.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student getStudent(int id);

}
