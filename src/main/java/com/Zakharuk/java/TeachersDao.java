package com.Zakharuk.java;

/**
 * Created by matvii on 08.03.17.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}
