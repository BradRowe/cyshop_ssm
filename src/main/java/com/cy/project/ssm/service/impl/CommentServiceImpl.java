package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Comment;
import com.cy.project.ssm.mapper.CommentMapper;
import com.cy.project.ssm.service.CommentService;
import com.cy.project.ssm.viewobject.CommentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lz - PC
 * @date 2019/11/8 - 14:25
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> selectAll(){
        return commentMapper.selectAll();
    }

    @Override
    public List<CommentVO> getComment() {
        return null;
    }

}
