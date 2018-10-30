package com.lsm.demo.entity;

public class Contact {
    private String id;
    private String teacherId;
    private String studentclassId;
    private String subjectId;
    private String time;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudentclassId() {
        return studentclassId;
    }

    public void setStudentclassId(String studentclassId) {
        this.studentclassId = studentclassId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
