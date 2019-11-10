package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.Sku;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface SkuMapper extends Mapper<Sku> {

    Integer updateStatusById(@Param("id")Integer id,@Param("skuStatus") Integer skuStatus);

    Integer updateSkuByIdAndPriceStockStockwarning(@Param("id")Integer id, @Param("price")Integer price, @Param("stock")Integer stock, @Param("stockWarning")Integer stockWarning);

}