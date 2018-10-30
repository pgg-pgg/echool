package com.lsm.demo.service;

import com.lsm.demo.Response.ResponseLogin;
import com.lsm.demo.Response.ResponseOrdinary;
import com.lsm.demo.Response.ResponseSelectAll;
import com.lsm.demo.dao.StudentDao;
import com.lsm.demo.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class StudentService {

    @Resource
    StudentDao studentDao;

    public ResponseOrdinary insertStudent(Student student) {
        studentDao.insertStudent(student);
        return selectStudentById(student.getId()) != null ?
                ResponseOrdinary.success("添加员工成功！！！") : ResponseOrdinary.error("添加员工失败！！！");
    }

    public ResponseOrdinary deleteStudent(Student student) {

        studentDao.deleteStudent(student);
        return selectStudentById(student.getId()) == null ?
                ResponseOrdinary.success("删除成功！！！") : ResponseOrdinary.error("删除失败！！！");
    }

    public ResponseOrdinary updateStudent(Student student) {
        studentDao.updateStudent(student);
        return selectStudentById(student.getId()) != null ?
                ResponseOrdinary.success("更新成功！！！") : ResponseOrdinary.error("更新失败！！！");

    }


    public Student selectStudentById(String id) {
        return studentDao.selectStudentId(id);
    }

    public ResponseSelectAll selectAllStudent() {
        return (studentDao.selectAllStudent() != null) ?
                ResponseSelectAll.success("密码正确", studentDao.selectAllStudent())
                : ResponseSelectAll.error("密码错误", studentDao.selectAllStudent());
    }

    public ResponseLogin login(String id, String password) {
        return (selectStudentById(id) != null) ?
                ((selectStudentById(id).getPassword().equals(password) ?
                        ResponseLogin.success(selectStudentById(id), "登录成功") : ResponseLogin.error(selectStudentById(id), "登录失败")
                )) : ResponseLogin.error(selectStudentById(id), "登录失败");

    }

    public ResponseSelectAll selectHeadNameTelAge() {
        return (studentDao.selectHeadNameTelAge() != null) ?
                ResponseSelectAll.success("正确", studentDao.selectHeadNameTelAge())
                : ResponseSelectAll.error("错误", studentDao.selectHeadNameTelAge());
    }
    public ResponseSelectAll selectNameTel() {
        return (studentDao.selectNameTel() != null) ?
                ResponseSelectAll.success("正确", studentDao.selectNameTel())
                : ResponseSelectAll.error("错误", studentDao.selectNameTel());
    }
    public ResponseSelectAll selectStudentInformation(String id) {
        return (studentDao.selectStudentInformation(id) != null) ?
                ResponseSelectAll.success("正确", studentDao.selectStudentInformation(id))
                : ResponseSelectAll.error("错误", studentDao.selectStudentInformation(id));
    }

    public ResponseSelectAll selectStudentByName(String name) {
        return (studentDao.selectStudentByName(name) != null) ?
                ResponseSelectAll.success("正确", studentDao.selectStudentByName(name))
                : ResponseSelectAll.error("错误", studentDao.selectStudentByName(name));
    }
}
