package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
//page 관련 컨트롤러
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        //서비스에서 가져온 결과를 posts라는 이름으로 index.mustache에 전달한다
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    } //view resolver가 index.mustache 를 반환하도록 처리해준다

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
