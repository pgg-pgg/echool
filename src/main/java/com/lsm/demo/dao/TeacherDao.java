package com.lsm.demo.dao;

import com.lsm.demo.entity.Student;
import com.lsm.demo.entity.Teacher;

import java.util.List;

public interface TeacherDao {
    void insertTeacher(Teacher teacher);
    void deleteTeacher(Teacher teacher);
    int updateTeacher(Teacher teacher);
    Teacher selectTeacherById(String id);
    List<Teacher> selectAllTeacher();
    List<Student> selectHeadNameTelAge();
    List<Student> selectNameTel();
    List<Student> selectStudentInformation();
    List<Teacher> selectTeacherByName(String name);
}
