package com.cy.project.ssm.web;

import com.cy.project.ssm.service.CatalogService;
import com.cy.project.ssm.viewobject.Catalog1VO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 1.0.0
 * @ClassName GoodsController
 * @Description TODO
 * @Author Administrator
 * @date 2019/11/722:29
 */
@RestController
@CrossOrigin("*")
public class GoodsController {
    @Autowired
    private CatalogService catalogService;

//    @ResponseBody
    @RequestMapping("/getCatalog")
    public String getCatalog() {
        List<Catalog1VO> catalog1VOS = catalogService.getCatalog();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String rs = mapper.writeValueAsString(catalog1VOS);
            System.out.println(rs);
            return  rs;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "1";
    }


}
