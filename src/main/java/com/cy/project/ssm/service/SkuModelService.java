package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.SkuModel;
import com.cy.project.ssm.viewobject.SkuModelVO;

import java.util.List;

public interface SkuModelService {
    Integer addSkuModel(SkuModel skuModel);

    List<SkuModelVO> selectAllVO();

    Integer delete(Integer id);

    Integer update(SkuModel skuModel);
}
