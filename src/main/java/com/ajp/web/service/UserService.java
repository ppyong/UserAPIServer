package com.ajp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajp.web.domain.User;
import com.ajp.web.repository.UserRepository;
import com.google.gson.Gson;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    private Gson gson;
    
    public UserService() {
        gson = new Gson();
    }
    
    public String getUserInfo(String id) {
        User user = userRepository.getUserInfo(id);
        return gson.toJson(user);
    }
}
