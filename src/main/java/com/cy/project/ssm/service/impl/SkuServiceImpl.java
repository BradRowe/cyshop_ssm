package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.domain.Sku;
import com.cy.project.ssm.mapper.SkuMapper;
import com.cy.project.ssm.service.SkuSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: SkuServiceImpl
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/8 10:08
 **/
@Service
@Transactional(timeout = 3)
public class SkuServiceImpl implements SkuSerice {

    @Autowired
    private SkuMapper skuMapper;

    @Override
    public List<Sku> skuAndAll() {
       List<Sku> skus = skuMapper.selectAll();
        return skus;
    }

    @Override
    public boolean skuByIdAndSkustatus(Integer id, Integer skuStatus) {
        Integer num = skuMapper.updateStatusById(id,skuStatus);
        if (num > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean skuByIdAndPriceStockStockwarning(Integer id, Integer price, Integer stock, Integer stockWarning) {

        Integer num = skuMapper.updateSkuByIdAndPriceStockStockwarning(id,price,stock,stockWarning);
        if (num > 0){
            return true;
        }

        return false;
    }
}
