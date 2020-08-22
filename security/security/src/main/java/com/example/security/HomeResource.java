package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getHome(){
        return "Welcome!!";
    }

    @GetMapping("/admin")
    public String getAdminHome(){
        return "Welcome Admin!!";
    }

    @GetMapping("/user")
    public String getUserHome(){
        return "Welcome User";
    }

}
