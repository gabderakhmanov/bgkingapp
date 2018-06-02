package com.abg.max.dao;

import com.abg.max.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getStudents();

    Student getStudent(int id);

    void deleteStudent(int id);
}
