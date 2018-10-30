package com.lsm.demo.service;

import com.lsm.demo.dao.ParentDao;
import com.lsm.demo.dao.StudentDao;
import com.lsm.demo.entity.Contact;
import com.lsm.demo.entity.Parent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParentService {
    @Resource
    ParentDao parentDao;
    public List<Parent> selectParentById(String id) {
        return parentDao.selectParentById(id);
    }
}
