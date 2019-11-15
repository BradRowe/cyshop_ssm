package com.cy.project.ssm.mapper;

import com.cy.project.ssm.domain.SkuModel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SkuModelMapper extends Mapper<SkuModel> {
    Integer selectlast();

    List<String> getAttri(String modelId);

    List<String> getValue(String model_id, String name);
}