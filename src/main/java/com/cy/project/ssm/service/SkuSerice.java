package com.cy.project.ssm.service;

import com.cy.project.ssm.domain.Sku;

import java.util.List;

/**
 * @ClassName: SkuSerice
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/8 10:05
 **/
public interface SkuSerice {

    List<Sku> skuAndAll();

    boolean skuByIdAndSkustatus(Integer id, Integer skuStatus);

    boolean skuByIdAndPriceStockStockwarning(Integer idInt, Integer priceInt, Integer stockInt, Integer stockWarningInt);

}
