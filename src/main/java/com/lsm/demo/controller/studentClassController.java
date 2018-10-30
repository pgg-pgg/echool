package com.lsm.demo.controller;

import com.lsm.demo.entity.Subject;
import com.lsm.demo.entity.studentClass;
import com.lsm.demo.service.StudentClassService;
import com.lsm.demo.service.SubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/StudentClass")
public class studentClassController {
    @Resource()
    StudentClassService studentClassService;

    @RequestMapping("/search")
    public studentClass selectSubjectById(String id) {
        System.out.println(studentClassService.selectStudentClassById(id));
        return studentClassService.selectStudentClassById(id);
    }

}
