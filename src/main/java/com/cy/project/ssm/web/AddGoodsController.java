package com.cy.project.ssm.web;

import com.cy.project.ssm.TO.SkuMatchTO;
import com.cy.project.ssm.domain.Sku;
import com.cy.project.ssm.domain.Spu;
import com.cy.project.ssm.service.ISkuSerice;
import com.cy.project.ssm.service.SkuSerice;
import com.cy.project.ssm.util.CoSkusUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName AddGoodsController
 * @Description TODO
 * @Author 吴桐
 * @date 2019/11/1519:11
 */
@RestController
@CrossOrigin("*")
public class AddGoodsController {
    @Autowired
    private ISkuSerice skuSerice;

    @RequestMapping("/getSkusListByModelId")
    public String getSkusListByModelId(@RequestParam(value = "modelId", required = false) String modelId) throws JsonProcessingException {
        //使用Jackson工具类
        ObjectMapper mapper = new ObjectMapper();
        //获得属性名称
        List<String> attriNames = skuSerice.getAttri(modelId);
        //申明属性值数组集合（同一属性为在同一集合）
        List<String>[] values = new List[attriNames.size()];
        int i = 0;
        for (String na : attriNames) {
            List<String> value = skuSerice.getValue(modelId, na);
            values[i++] = value;
        }
        //执行排列组合
        List<String[]> cos = CoSkusUtils.coSkus(attriNames, values);
        String rs = mapper.writeValueAsString(cos);
        System.out.println(rs);
        return rs;

    }

    @RequestMapping("/addSkus")
    public String addSkus(@RequestParam(value = "sku", required = false) String skus, @RequestParam(value = "spu", required = false) String spu) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(spu);
        //先插入spu通过主键策略返回id
        Spu spu1 = mapper.readValue(spu, Spu.class);

        Integer row = skuSerice.addSpu(spu1);
        if (row != 1) {
            return "2";
        }

        List<Sku> skus1 = mapper.readValue(skus, new TypeReference<List<Sku>>() {
        });
        for (Sku s : skus1) {
            s.setSpuId(spu1.getId());
            s.setStockWarning(0);
            s.setSkuStatus(1);
            Integer row2 = skuSerice.add(s);
            if (row2 != 1) {
                return "3";
            }
        }
        System.out.println(skus);
        return "1";
    }

}
