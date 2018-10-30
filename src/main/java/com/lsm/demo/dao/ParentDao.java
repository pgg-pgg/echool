package com.lsm.demo.dao;

import com.lsm.demo.entity.Parent;
import com.lsm.demo.entity.studentClass;

import java.util.List;

public interface ParentDao {
    List<Parent> selectParentById(String id);
}
