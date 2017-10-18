package com.ly.dc.contacts.web.controller;

import com.ly.dc.contacts.entity.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

/**
 * Created by Administrator on 2017/10/14 0014.
 */
@Controller
@RequestMapping("/")
public class ContactController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String,Object> model){
        List<Contact> contacts= new ArrayList<Contact>();
        Contact Tom=new Contact(new Long(123),"Tom","adear","44455566","44455566@ly.com");
        contacts.add(Tom);
        model.put("contacts",contacts);
        return "home";
    }
}
