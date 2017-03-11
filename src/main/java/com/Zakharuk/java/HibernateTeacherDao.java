package com.Zakharuk.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by matvii on 08.03.17.
 */
@Repository
public class HibernateTeacherDao implements TeachersDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }

}
