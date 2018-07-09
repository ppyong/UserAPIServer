package com.ajp.web.service;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Value("${datasource.driver-class-name}")
    private String driverClassName;

    private Gson gson;

    public ConfigService (){
        gson = new Gson();
    }

    public String getConfigInfo(){
        return driverClassName;
    }

}
