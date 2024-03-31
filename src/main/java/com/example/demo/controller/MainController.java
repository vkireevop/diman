package com.example.demo.controller;

import com.example.demo.model.MyObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/sendJson")
    public MyObject sendJson() {
        MyObject myObject = new MyObject();
        myObject.setName("Test");
        myObject.setDescription("This is a test object");
        return myObject;
    }
}
