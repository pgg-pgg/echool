package com.lsm.demo.controller;

import com.alibaba.fastjson.JSON;
import com.lsm.demo.entity.Student;
import com.lsm.demo.entity.Teacher;
import com.lsm.demo.service.StudentService;
import com.lsm.demo.service.TeacherService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/Teacher")
public class teacherController {
    @Resource()
    TeacherService teacherService;

    @RequestMapping("/insertTeacher")
    public String insertTeacher(Teacher teacher) {
        teacher.setPassword("123456");//设置默认密码为123456
        teacher.setHeaderUrl("image/face_default.jpg");//设置默认头像
        teacher.setBackgroundUrl("image/background_default.jpg");//设置默认背景
        return JSON.toJSONString(teacherService.insertTeacher(teacher));
    }

    @RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
    public String insertTeacherByJson(@RequestBody Teacher teacher) {

        teacher.setPassword("123456");//设置默认密码为123456
        teacher.setHeaderUrl("image/face_default.jpg");//设置默认头像
        teacher.setBackgroundUrl("image/background_default.jpg");//设置默认背景

        return JSON.toJSONString(teacherService.insertTeacher(teacher));

    }

    @RequestMapping("/delete")
    public String deleteTeacher(Teacher teacher) {
        return JSON.toJSONString(teacherService.deleteTeacher(teacher));
    }

    @RequestMapping("/updateTeacher")
    public String updateStudent(Teacher teacher) {
        return JSON.toJSONString(teacherService.updateTeacher(teacher));
    }

    @RequestMapping(value = "//updateTeacherCon", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateStudentByJson(@RequestBody Teacher teacher) {
        return JSON.toJSONString(teacherService.updateTeacher(teacher));
    }

    @RequestMapping("/search")
    public Teacher selectStudentById(String id) {
        System.out.println(teacherService.selectTeacherById(id));
        return teacherService.selectTeacherById(id);
    }

    @RequestMapping("/getAllTeacher")
    public String selectAllTeacher() {
        return JSON.toJSONString(teacherService.selectAllTeacher());
    }



    @RequestMapping("/searchTeacherCall")
    public String selectNameTel() {
        return JSON.toJSONString(teacherService.selectNameTel());
    }
    @RequestMapping("/searchHeadNameTelAge")
    public String selectHeadNameTelAge() {
        return JSON.toJSONString(teacherService.selectHeadNameTelAge());
    }
    @RequestMapping("/searchTeacherCall222222222")  //根据老师的学号进行查询与他相关的课程，班级，等等
    public String selectStudentInformation() {
        return JSON.toJSONString(teacherService.selectStudentInformation());
    }

    @RequestMapping("/searchTeacherByName")
    public String selectTeacherByName(String name) {
        return JSON.toJSONString(teacherService.selectTeacherByName(name));
    }
    @RequestMapping("/searchClassStudentInformation")//根据老师登录id获得所有课程班级，再根据班级获得人信息
    public String selectClassStudentInformation(String name) { //这个就是根据班级获得所有学生信息
        return JSON.toJSONString(teacherService.selectClassStudentInformation(name));
    }
    @RequestMapping("/login")
    public String loginStudent(String id, String password) {
        String json = JSON.toJSONString(teacherService.login(id, password));
        return json;
    }
}
