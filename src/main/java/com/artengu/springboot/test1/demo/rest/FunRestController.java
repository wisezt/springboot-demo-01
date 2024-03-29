package com.artengu.springboot.test1.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    // inject properties for :  team.type and team.name
    @Value("${team.name}")
    private String teamName;

    @Value("${team.type}")
    private String teamType;

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!001 Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String workout(){
        return "This is the workout! <br/> Time on server is " + LocalDateTime.now();
    }
    @GetMapping("/workout01")
    public String workout01(){
        return "This is the workout! 01 <br/> Time on server is " + LocalDateTime.now();
    }


    //expose team info
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Team Name: " + teamName + " <br/> Team Type: " +teamType;
    }



}
