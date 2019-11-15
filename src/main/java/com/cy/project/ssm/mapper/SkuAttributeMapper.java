package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.SkuAttribute;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.Mapper;

public interface SkuAttributeMapper extends Mapper<SkuAttribute> {

    int insertOne(SkuAttribute skuAttribute);


}