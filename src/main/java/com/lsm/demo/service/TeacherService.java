package com.lsm.demo.service;

import com.lsm.demo.Response.ResponseLogin;
import com.lsm.demo.Response.ResponseOrdinary;
import com.lsm.demo.Response.ResponseSelectAll;
import com.lsm.demo.dao.TeacherDao;
import com.lsm.demo.entity.Teacher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {
    @Resource
    TeacherDao teacherDao;
    @Resource
    ContactService contactService;
    @Resource
    StudentService studentService;
    public ResponseOrdinary insertTeacher(Teacher teacher) {
        teacherDao.insertTeacher(teacher);
        return selectTeacherById(teacher.getId()) != null ?
                ResponseOrdinary.success("添加员工成功！！！") : ResponseOrdinary.error("添加员工失败！！！");
    }

    public ResponseOrdinary deleteTeacher(Teacher teacher) {

        teacherDao.deleteTeacher(teacher);
        return selectTeacherById(teacher.getId()) == null ?
                ResponseOrdinary.success("删除成功！！！") : ResponseOrdinary.error("删除失败！！！");
    }

    public ResponseOrdinary updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
        return selectTeacherById(teacher.getId()) != null ?
                ResponseOrdinary.success("更新成功！！！") : ResponseOrdinary.error("更新失败！！！");

    }


    public Teacher selectTeacherById(String id) {
        return teacherDao.selectTeacherById(id);
    }

    public ResponseSelectAll selectAllTeacher() {
        return (teacherDao.selectAllTeacher() != null) ?
                ResponseSelectAll.success("密码正确", teacherDao.selectAllTeacher())
                : ResponseSelectAll.error("密码错误", teacherDao.selectAllTeacher());
    }

    public ResponseSelectAll selectNameTel() {
        return (teacherDao.selectNameTel() != null) ?
                ResponseSelectAll.success("正确", teacherDao.selectNameTel())
                : ResponseSelectAll.error("错误", teacherDao.selectNameTel());
    }
    public ResponseSelectAll selectHeadNameTelAge() {
        return (teacherDao.selectHeadNameTelAge() != null) ?
                ResponseSelectAll.success("正确", teacherDao.selectHeadNameTelAge())
                : ResponseSelectAll.error("错误", teacherDao.selectHeadNameTelAge());
    }
    public ResponseSelectAll selectStudentInformation() {
        return (teacherDao.selectStudentInformation() != null) ?
                ResponseSelectAll.success("正确", teacherDao.selectStudentInformation())
                : ResponseSelectAll.error("错误", teacherDao.selectStudentInformation());
    }

    public ResponseSelectAll selectTeacherByName(String name) {
        return (teacherDao.selectTeacherByName(name) != null) ?
                ResponseSelectAll.success("正确", teacherDao.selectTeacherByName(name))
                : ResponseSelectAll.error("错误", teacherDao.selectTeacherByName(name));
    }
    public ResponseSelectAll selectTeacherContactInformation(String id) {
        return (contactService.selectContactById(id) != null) ?
                ResponseSelectAll.success("正确", contactService.selectContactById(id))
                : ResponseSelectAll.error("错误", contactService.selectContactById(id));
    }

    public ResponseSelectAll selectClassStudentInformation(String name) { //根据老师登录id获得所有课程班级，再根据班级获得人信息
        return (studentService.selectStudentByName(name) != null) ?       //这个就是根据班级获得所有学生信息
                ResponseSelectAll.success("正确", (List<?>) studentService.selectStudentByName(name))
                : ResponseSelectAll.error("错误", (List<?>) studentService.selectStudentByName(name));
    }
    public ResponseLogin login(String id, String password) {
        return (selectTeacherById(id) != null) ?
                ((selectTeacherById(id).getPassword().equals(password) ?
                        ResponseLogin.success(selectTeacherById(id), "登录成功") : ResponseLogin.error(selectTeacherById(id), "登录失败")
                )) : ResponseLogin.error(selectTeacherById(id), "登录失败");

    }
}
