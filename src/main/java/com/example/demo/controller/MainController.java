package com.example.demo.controller;

import com.example.demo.model.MyObject;
import com.example.demo.model.ResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @PostMapping("/receiveJson")
    public ResponseObject receiveJson(@RequestParam(value = "param", defaultValue = "default") String param) {
        // Здесь вы можете обрабатывать полученный объект MyObject и параметр param
        ResponseObject responseObject = new ResponseObject();
        if (param.equals("1"))
        {
            responseObject.setMessage("правильно");
            return responseObject;
        }
        responseObject.setMessage("хуесос");
        return responseObject;
    }
}
