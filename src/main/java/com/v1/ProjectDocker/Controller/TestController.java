package com.v1.ProjectDocker.Controller;

import com.v1.ProjectDocker.Service.TestService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/v1")
    public String healthCheck(HttpServletRequest request){
        String response = testService.healthCheck();
        return response + " "+request.getSession().getId();
    }
}
