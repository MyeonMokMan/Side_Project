package com.side.project.controller.member;

import com.side.project.createForm.member.JoinMemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    /*
    * 로그인 페이지
    */
    @GetMapping("/login")
    public String loginPage() {

        return "project/member/login";
    }

    /*
    * 로그인 구현
    */
    @PostMapping("/login")
    public void login() {

    }

    /*
    * 회원가입 페이지
    */
    @GetMapping("/member/join")
    public String joinPage(Model model) {

        model.addAttribute("joinMember", new JoinMemberDTO());

        return "project/member/join";
    }

    /*
     * 회원가입
     */
    @PostMapping("/member/join")
    public String join() {

        return "";
    }
}
