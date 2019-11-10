package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.MemberLevel;
import com.cy.project.ssm.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: MemberLevelController
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/10 12:23
 **/
@RestController
@CrossOrigin("*")
public class MemberLevelController {

    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 将所有会员等级数据返回给web端
     * @return
     */
    @ResponseBody
    @RequestMapping("/memberLevelAll.vue")
    public List<MemberLevel> memberLevelAll(){
        return memberLevelService.memberLevelAll();
    }


    /**
     * 添加新的会员等级
     * 将用户输入的会员数据，等级，折扣，等级名称传输到数据库
     * @param level
     * @param discount
     * @param name
     * @return
     */
    @RequestMapping("/memberLevelByNewMemberLevel.vue")
    public boolean memberLevelByNewMemberLevel(@RequestParam(value = "level",required = false) String level,
                                               @RequestParam(value = "discount",required = false) String discount,
                                               @RequestParam(value = "name",required = false) String name)
    {

        int levelInt = Integer.parseInt(level);
        double discountDouble = Double.parseDouble(discount);

        boolean text = memberLevelService.memberLevelNewMemberLevels(levelInt,discountDouble,name);

        return text;
    };

    /**
     * 会员等级信息的更改
     * 通过web端获取的id；来更改会员等级的名称以及折扣率
     * @param id
     * @param name
     * @param discount
     * @return
     */
    @RequestMapping("/memberLevelByIdAndNameAndDiscount.vue")
    public boolean memberLevelByIdAndNameAndDiscount(@RequestParam(value = "id",required = false) String id,
                                                     @RequestParam(value = "name",required = false) String name,
                                                     @RequestParam(value = "discount",required = false) String discount)
    {
//        进行数据转换
        int idInt = Integer.parseInt(id);
        double discountDouble = Double.parseDouble(discount);

        boolean text = memberLevelService.memberLevelByIdAndNmameDiscount(idInt,name,discountDouble);

        return text;
    }


}
