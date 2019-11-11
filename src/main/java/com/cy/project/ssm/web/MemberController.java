package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.Member;
import com.cy.project.ssm.domain.MemberAddName;
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
    public List<MemberAddName> memberListByAll(){
        return memberService.memberAndAll();
    }

    /**
     * 接收页面传送过来的会员状态
     * @param id
     * @param status
     */
    @RequestMapping("/memberListByIdAndSrtatus.vue")
    public boolean memberListByIdAndSrtatus(@RequestParam(value="id",required = false) String id,
                        @RequestParam(value="status",required = false) String status)
    {
//      将获取的数据转换为int类型
        int idInt = Integer.parseInt(id);
        int statusInt = Integer.parseInt(status);
//      通过id和status对数据库进行操作
        boolean text = memberService.memberById(idInt,statusInt);
        return text;
    }

    /**
     * 新增会员
     * 接收web端传送过来的新会员信息，名字，账号，密码，手机号
     * @param name
     * @param account
     * @param password
     * @param phone
     * @return
     */
    @RequestMapping("/memberListByNewMember.vue")
    public boolean memberListByNewMember(@RequestParam(value = "name",required = false) String name,
                                         @RequestParam(value = "account",required = false) String account,
                                         @RequestParam(value = "password",required = false) String password,
                                         @RequestParam(value = "phone",required = false) String phone){

        boolean text = memberService.memberByNewMembers(name,account,password,phone);
        return text;
    }

}
