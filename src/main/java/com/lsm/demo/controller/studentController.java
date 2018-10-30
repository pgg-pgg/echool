package com.lsm.demo.controller;

import com.alibaba.fastjson.JSON;
import com.lsm.demo.entity.Student;
import com.lsm.demo.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Student")
public class studentController {
    @Resource
    StudentService studentService;

    @RequestMapping("/insertStudent")
    public String insertStudent(Student student) {
        student.setPassword("123456");//设置默认密码为123456
        student.setHeaderUrl("image/face_default.jpg");//设置默认头像
        student.setBackgroundUrl("image/background_default.jpg");//设置默认背景
        return JSON.toJSONString(studentService.insertStudent(student));
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
    public String insertStudentByJson(@RequestBody Student student) {

        student.setPassword("123456");//设置默认密码为123456
        student.setHeaderUrl("image/face_default.jpg");//设置默认头像
        student.setBackgroundUrl("image/background_default.jpg");//设置默认背景

        return JSON.toJSONString(studentService.insertStudent(student));

    }

    @RequestMapping("/delete")
    public String deleteStudent(Student student) {
        return JSON.toJSONString(studentService.deleteStudent(student));
    }

    @RequestMapping("/updateEmployee")
    public String updateStudent(Student student) {
        return JSON.toJSONString(studentService.updateStudent(student));
    }

    @RequestMapping(value = "//updateEmployeeCon", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateStudentByJson(@RequestBody Student student) {
        return JSON.toJSONString(studentService.updateStudent(student));
    }

    @RequestMapping("/search")
    public Student selectStudentById(String id) {
        System.out.println(studentService.selectStudentById(id));
        return studentService.selectStudentById(id);
    }

    @RequestMapping("/getAllStudent")
    public String selectAllStudent() {
        return JSON.toJSONString(studentService.selectAllStudent());
    }


    @RequestMapping("/login")
    public String loginStudent(String id, String password) {
        String json = JSON.toJSONString(studentService.login(id, password));
        return json;
    }
    @RequestMapping("/searchStudentInformation")
    public String selectStudentInformation(String id) {
        return JSON.toJSONString(studentService.selectStudentInformation(id));
    }
    @RequestMapping("/searchStudentCall")
    public String selectHeadNameTelAge() {
        return JSON.toJSONString(studentService.selectHeadNameTelAge());
    }
    @RequestMapping("/selectNameTel")
    public String selectNameTel() {
        return JSON.toJSONString(studentService.selectNameTel());
    }

    @RequestMapping("/searchStudentByName")
    public String selectStudentByName(String name) {
        return JSON.toJSONString(studentService.selectStudentByName(name));
    }
}
