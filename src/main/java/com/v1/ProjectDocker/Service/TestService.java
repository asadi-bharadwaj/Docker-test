package com.v1.ProjectDocker.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String healthCheck(){
        return "Success 200 OK";
    }
}
