package com.lsm.demo.dao;

import com.lsm.demo.entity.Student;
import com.lsm.demo.entity.studentClass;

public interface StudentClassDao {
    studentClass selectStudentClassById(String id);
}
