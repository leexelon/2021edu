package com.asianaidt.edu01.controller;

import com.asianaidt.edu01.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

        @GetMapping("/article/new")
        public String newArticleForm(){
            return "article/new";
        }

        @PostMapping("/articles/create")
        public String createArticle(ArticleForm form){
            System.out.println(form.toString());
            return "";
        }
}
