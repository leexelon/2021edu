package com.asianaidt.edu01.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstContoller {

    public String niceToMeetYou(){
        return "greetings"; //templates/greeting.mustache -> 브라우저 전송!
    }
}
