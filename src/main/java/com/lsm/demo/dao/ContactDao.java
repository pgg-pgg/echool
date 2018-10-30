package com.lsm.demo.dao;

import com.lsm.demo.entity.Contact;

import java.util.List;

public interface ContactDao {
    List<Contact> selectContactById(String id);
}
