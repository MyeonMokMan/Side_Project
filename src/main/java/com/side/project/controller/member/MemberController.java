package com.side.project.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @GetMapping("/login")
    public String loginPage() {

        return "project/member/login";
    }

    @PostMapping("/login")
    public void login() {

    }
}
