package com.lsm.demo.controller;

import com.lsm.demo.entity.Contact;
import com.lsm.demo.service.ContactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Contact")
public class ContactController {
    @Resource()
    ContactService contactService;

    @RequestMapping("/search")
    public List<Contact> selectContactById(String id) {
        System.out.println(contactService.selectContactById(id));
        return contactService.selectContactById(id);
    }

}
