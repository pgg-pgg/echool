package com.lsm.demo.controller;

import com.alibaba.fastjson.JSON;
import com.lsm.demo.entity.Student;
import com.lsm.demo.entity.Subject;
import com.lsm.demo.service.StudentService;
import com.lsm.demo.service.SubjectService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/Subject")
public class subjectController {
    @Resource()
    SubjectService subjectService;

    @RequestMapping("/insertSubject")
    public String insertStudent(Subject subject) {
        return JSON.toJSONString(subjectService.insertSubject(subject));
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
    public String insertSubjectByJson(@RequestBody Subject subject) {
        return JSON.toJSONString(subjectService.insertSubject(subject));

    }

    @RequestMapping("/delete")
    public String deleteSubject(Subject subject) {
        return JSON.toJSONString(subjectService.deleteStudent(subject));
    }

    @RequestMapping("/updateEmployee")
    public String updateSubject(Subject subject) {
        return JSON.toJSONString(subjectService.updateStudent(subject));
    }

    @RequestMapping(value = "//updateEmployeeCon", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateSubjectByJson(@RequestBody Subject subject) {
        return JSON.toJSONString(subjectService.updateStudent(subject));
    }

    @RequestMapping("/search")
    public Subject selectSubjectById(String id) {
        System.out.println(subjectService.selectSubjectById(id));
        return subjectService.selectSubjectById(id);
    }

    @RequestMapping("/getAllStudent")
    public String selectAllSubject() {
        return JSON.toJSONString(subjectService.selectAllSubject());
    }

    @RequestMapping("/searchStudentCall")
    public String selectHeadNameTel() {
        return JSON.toJSONString(subjectService.selectHeadNameTel());
    }

    @RequestMapping("/searchStudentByName")
    public String selectStudentByName(String name) {
        return JSON.toJSONString(subjectService.selectStudentByName(name));
    }
}
