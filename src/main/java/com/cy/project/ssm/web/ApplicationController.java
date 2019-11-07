package com.cy.project.ssm.web;


import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.service.MemberService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.List;

/**
 * @author 罗海
 * @date 2019/11/4 - 12:07
 */
@RestController
@CrossOrigin("*")
public class ApplicationController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/login.html")
    public String login(){
        List<Member> members = memberService.memberAndAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(members);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("/test")
    public String test(Member member){
            System.out.println(member);
        return member.toString();
    }



}
