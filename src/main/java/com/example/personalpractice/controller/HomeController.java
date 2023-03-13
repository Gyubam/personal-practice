package com.example.personalpractice.controller;

import com.example.personalpractice.service.MemberService;
import com.example.personalpractice.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String home() {
        return "ok";
    }

    @PostMapping("/insert")
    public String insertMember(MemberVO vo) {

        memberService.createMember(vo);

        return "ok";
    }

    @GetMapping("/select/{id}")
    public String select(@PathVariable("id") int id, Model model) {

        MemberVO member = memberService.getMember(id);
        System.out.println("member.getId() = " + member.getId());
        System.out.println("member.getName() = " + member.getName());
        model.addAttribute("member", member);

        return "select";
    }
}
