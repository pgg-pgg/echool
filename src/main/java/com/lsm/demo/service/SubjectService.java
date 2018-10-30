package com.lsm.demo.service;

import com.lsm.demo.Response.ResponseLogin;
import com.lsm.demo.Response.ResponseOrdinary;
import com.lsm.demo.Response.ResponseSelectAll;
import com.lsm.demo.dao.StudentDao;
import com.lsm.demo.dao.SubjectDao;
import com.lsm.demo.entity.Student;
import com.lsm.demo.entity.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SubjectService {
    @Resource
    SubjectDao subjectDao;
    public ResponseOrdinary insertSubject(Subject subject) {
        subjectDao.insertSubject(subject);
        return selectSubjectById(subject.getId()) != null ?
                ResponseOrdinary.success("添加科目成功！！！") : ResponseOrdinary.error("添加科目失败！！！");
    }

    public ResponseOrdinary deleteStudent(Subject subject) {

        subjectDao.deleteSubject(subject);
        return selectSubjectById(subject.getId()) == null ?
                ResponseOrdinary.success("删除成功！！！") : ResponseOrdinary.error("删除失败！！！");
    }

    public ResponseOrdinary updateStudent(Subject subject) {
        subjectDao.updateSubject(subject);
        return selectSubjectById(subject.getId()) != null ?
                ResponseOrdinary.success("更新成功！！！") : ResponseOrdinary.error("更新失败！！！");

    }


    public Subject selectSubjectById(String id) {
        return subjectDao.selectSubjectById(id);
    }

    public ResponseSelectAll selectAllSubject() {
        return (subjectDao.selectAllSubject() != null) ?
                ResponseSelectAll.success("密码正确", subjectDao.selectAllSubject())
                : ResponseSelectAll.error("密码错误", subjectDao.selectAllSubject());
    }

    public ResponseSelectAll selectHeadNameTel() {
        return (subjectDao.selectHeadNameTel() != null) ?
                ResponseSelectAll.success("正确", subjectDao.selectHeadNameTel())
                : ResponseSelectAll.error("错误", subjectDao.selectHeadNameTel());
    }

    public ResponseSelectAll selectStudentByName(String name) {
        return (subjectDao.selectSubjectByName(name) != null) ?
                ResponseSelectAll.success("正确", subjectDao.selectSubjectByName(name))
                : ResponseSelectAll.error("错误", subjectDao.selectSubjectByName(name));
    }
}
