package com.Zakharuk.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by matvii on 08.03.17.
 */
public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
        Student testStudent = new Student("John Doe", 5);
        worker.saveStudentToDb(testStudent);

        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTacher(teacher);
    }
}
