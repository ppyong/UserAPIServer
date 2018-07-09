package com.ajp.web;

import com.ajp.web.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ajp.web.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @Autowired
    private UserService userService;

    @Autowired
    private ConfigService configService;

    @RequestMapping("/")
    public String index() {
        return "Welcome Index Page !";
    }
    
    @RequestMapping("/user/{id}")
    public String getUserInfo(@PathVariable("id") String id) {
        return userService.getUserInfo(id);
    }

    @RequestMapping("/config")
    public String getConfig(){
        return configService.getConfigInfo();
    }
}
