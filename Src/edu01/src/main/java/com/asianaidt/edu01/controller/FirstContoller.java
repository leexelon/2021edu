package com.asianaidt.edu01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstContoller {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("userName", "승휘");
        return "greetings"; //templates/greeting.mustache -> 브라우저 전송!
    }

    @GetMapping("/bye")
    public String seeYou(Model model){
        model.addAttribute("userName", "이승휘");
        return "goodBye"; //templates/greeting.mustache -> 브라우저 전송!
    }
}
