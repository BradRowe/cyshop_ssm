package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Sku;
import com.cy.project.ssm.domain.Spu;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName ISkuSerice
 * @Description TODO
 * @Author 吴桐
 * @date 2019/11/1521:20
 */
public interface ISkuSerice {

    List<String> getAttri(String modelId);

    List<String> getValue(String modelId, String na);

    Integer addSpu(Spu spu1);

    Integer add(Sku s);
}
