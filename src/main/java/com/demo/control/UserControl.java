package com.demo.control;

import com.demo.entity.Userinfo;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/insert")
    public String insert(Userinfo user){

        userService.insert(user);
        return user.getUserName();
    }

    @RequestMapping("/insertSelective")
    public String insertSelective(Userinfo user){

        userService.insertSelective(user);
        return user.getUserName();
    }

}
