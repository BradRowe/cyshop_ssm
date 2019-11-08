package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Comment;
import com.cy.project.ssm.viewobject.CommentVO;

import java.util.List;

/**
 * @author lz - PC
 * @date 2019/11/8 - 14:22
 */
public interface CommentService {
//    查询comment所有的数据的抽象方法
    List<Comment> selectAll();

    List<CommentVO> getComment();
}
