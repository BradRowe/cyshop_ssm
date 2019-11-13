package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Spu;
import com.cy.project.ssm.mapper.SpuMapper;
import com.cy.project.ssm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName GoodsServiceImpl
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/110:19
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private SpuMapper spuMapper;

    @Override
    public List<Spu> selectAll() {
        return spuMapper.selectAll();
    }
}
