package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.Comment;
import com.cy.project.ssm.service.CommentService;
import com.cy.project.ssm.viewobject.CommentVO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lz - PC
 * @date 2019/11/8 - 14:37
 */
@RestController
@CrossOrigin("*")
public class CommentController {
    @Autowired
    private CommentService commentService;

//    建立一个自己的地址
    @RequestMapping("/getComment")

//    返回String类型的方法
    public String getComment(){
        List<Comment> comments = commentService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String cc = mapper.writeValueAsString(comments);
            System.out.println(cc);
            return cc;
        }catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "错误";
    }
}
