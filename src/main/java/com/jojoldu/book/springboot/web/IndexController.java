package com.jojoldu.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//page 관련 컨트롤러
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    } //view resolver가 index.mustache 를 반환하도록 처리해준다

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
