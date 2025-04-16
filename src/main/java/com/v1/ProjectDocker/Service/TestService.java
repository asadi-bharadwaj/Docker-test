package com.v1.ProjectDocker.Service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String healthCheck(){
        return "I am service 1 and my session Id is : ";
    }
}
