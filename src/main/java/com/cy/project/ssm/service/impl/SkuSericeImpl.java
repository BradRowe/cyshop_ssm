package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Sku;
import com.cy.project.ssm.domain.Spu;
import com.cy.project.ssm.mapper.SkuMapper;
import com.cy.project.ssm.mapper.SkuModelMapper;
import com.cy.project.ssm.mapper.SpuMapper;
import com.cy.project.ssm.service.ISkuSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName ISkuSericeImpl
 * @Description TODO
 * @Author 吴桐
 * @date 2019/11/1521:21
 */
@Service
public class SkuSericeImpl implements ISkuSerice {
    @Autowired
    private SkuModelMapper skuModelMapper;
    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private SpuMapper spuMapper;

    @Override
    public List<String> getAttri(String modelId) {
        return skuModelMapper.getAttri(modelId);
    }

    @Override
    public List<String> getValue(String modelId, String na) {
        return skuModelMapper.getValue(modelId,na);
    }

    @Override
    public Integer addSpu(Spu spu1) {
        return spuMapper.insert(spu1);
    }

    @Override
    public Integer add(Sku s) {
        return skuMapper.insert(s);
    }
}
