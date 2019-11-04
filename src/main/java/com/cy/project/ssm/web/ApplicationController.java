package com.cy.project.ssm.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lz - PC
 * @date 2019/11/4 - 12:07
 */
@Controller
public class ApplicationController {
    public ApplicationController() {
        System.out.println("Ssssssssssssssssssssss");
    }

    @RequestMapping("/login.html")
    public String login(){
        System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<");
        return "login";
    }
}
