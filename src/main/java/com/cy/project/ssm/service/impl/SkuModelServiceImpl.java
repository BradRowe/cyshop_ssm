package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.SkuModel;
import com.cy.project.ssm.mapper.SkuModelMapper;
import com.cy.project.ssm.mapper.SkuModelVOMapper;
import com.cy.project.ssm.service.SkuModelService;
import com.cy.project.ssm.viewobject.SkuModelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName SkuModelServiceImpl
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/1021:50
 */
@Service
public class SkuModelServiceImpl implements SkuModelService {
    @Autowired
    private SkuModelMapper skuModelMapper;
    @Autowired
    private SkuModelVOMapper skuModelVOMapper;

    @Override
    public Integer addSkuModel(SkuModel skuModel) {
        return skuModelMapper.insert(skuModel);
    }

    @Override
    public List<SkuModelVO> selectAllVO() {
        return skuModelVOMapper.selectAll();
    }

    @Override
    public Integer delete(Integer id) {
        SkuModel skuModel = new SkuModel();
        skuModel.setId(id);
        return skuModelMapper.delete(skuModel);
    }

    @Override
    public Integer update(SkuModel skuModel) {
        return skuModelMapper.updateByPrimaryKey(skuModel);
    }

    @Override
    public Integer getLastId() {
        return skuModelMapper.selectlast();
    }
}
