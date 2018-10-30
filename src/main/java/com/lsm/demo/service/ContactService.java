package com.lsm.demo.service;

import com.lsm.demo.dao.ContactDao;
import com.lsm.demo.dao.StudentClassDao;
import com.lsm.demo.entity.Contact;
import com.lsm.demo.entity.studentClass;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {
    @Resource
    ContactDao contactDao;
    public List<Contact> selectContactById(String id) {
        return contactDao.selectContactById(id);
    }
}
