package com.lsm.demo.dao;

import com.lsm.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    void insertStudent(Student student);
    void deleteStudent(Student student);
    int updateStudent(Student student);
    Student selectStudentId(String id);
    List<Student> selectAllStudent();
    List<Student> selectHeadNameTelAge();
    List<Student> selectNameTel();
    List<Student> selectStudentInformation(String id);
    List<Student> selectStudentByName(String name);
}
