package com.Zakharuk.java;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by matvii on 08.03.17.
 */
public class WorkWithStudents {

    @Autowired
    private StudentDao studentDao;

    public void saveStudentToDb(Student student) {
        if ((student != null) && (student.getPib() != null) && (!"".equals(student.getPib())) && (student.getCourse() > 0)) {
            studentDao.addStudent(student);
            System.out.println("Student have been saved " + student);
        }
    }
}
