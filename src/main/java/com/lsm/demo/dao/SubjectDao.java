package com.lsm.demo.dao;

import com.lsm.demo.entity.Subject;

import java.util.List;

public interface SubjectDao {
    void insertSubject(Subject subject);
    void deleteSubject(Subject subject);
    int updateSubject(Subject subject);
    Subject selectSubjectById(String id);
    List<Subject> selectAllSubject();
    List<Subject> selectHeadNameTel();
    List<Subject> selectSubjectByName(String name);
}
