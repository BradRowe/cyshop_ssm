package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: MemberController
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/7 21:00
 **/
@RestController
@CrossOrigin("*")
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 发送会员列表到web页面
     * @return
     */
    @ResponseBody
    @RequestMapping("/memberListByAll.vue")
    public List<Member> login(){
        return memberService.memberAndAll();
    }

    /**
     * 接收页面传送过来的会员状态
     * @param id
     * @param status
     */
    @ResponseBody
    @RequestMapping("/memberListByIdAndSrtatus.vue")
    public boolean test(@RequestParam(value="id",required = false) String id,@RequestParam(value="status",required = false) String status)
    {

        System.out.println(id);
        System.out.println(status);

        int idInt = Integer.parseInt(id);
        int statusInt = Integer.parseInt(status);

        boolean text = memberService.memberById(idInt,statusInt);


        return text;
    }
}
