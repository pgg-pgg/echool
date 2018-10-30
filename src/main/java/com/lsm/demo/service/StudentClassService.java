package com.lsm.demo.service;

import com.lsm.demo.dao.StudentClassDao;
import com.lsm.demo.dao.StudentDao;
import com.lsm.demo.entity.Subject;
import com.lsm.demo.entity.studentClass;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentClassService {
    @Resource
    StudentClassDao studentClassDao;
    public studentClass selectStudentClassById(String id) {
        return studentClassDao.selectStudentClassById(id);
    }

}
