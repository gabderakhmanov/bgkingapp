package com.abg.max.dao;

import com.abg.max.entity.Student;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> getStudents() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query
        Query<Student> theQuery = currentSession.createQuery("from Student", Student.class);

        // execute query and get result list
        List<Student> students = theQuery.getResultList();

        return students;
    }

    @Override
    public Student getStudent(int id) {

        Session currentSession = sessionFactory.getCurrentSession();

        // now retrieve/read from database using the primary key
        Student student = currentSession.get(Student.class, id);

        return student;
    }
}
