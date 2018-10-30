package com.lsm.demo.controller;

import com.lsm.demo.entity.Parent;
import com.lsm.demo.service.ParentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Parent")
public class parentController {
    @Resource()
    ParentService parentService;

    @RequestMapping("/search")
    public List<Parent> selectParentById(String id) {
        System.out.println(parentService.selectParentById(id));
        return parentService.selectParentById(id);
    }
}
