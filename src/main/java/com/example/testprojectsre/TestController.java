package com.example.testprojectsre;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @Value("${spring.datasource.url}")
    private String datasourceUrl;
    @GetMapping("/test")
    public String test(){
        return "test endpoint called successfully";
    }
    @GetMapping("/test-db")
    public String testDb(){
        return "test endpoint called successfully: " + datasourceUrl;
    }
}
