package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.SkuModel;
import com.cy.project.ssm.domain.Spu;
import com.cy.project.ssm.service.CatalogService;
import com.cy.project.ssm.service.GoodsService;
import com.cy.project.ssm.service.SkuModelService;
import com.cy.project.ssm.viewobject.Catalog1VO;
import com.cy.project.ssm.viewobject.SkuModelVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SkuModelService skuModelService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getGoods")
    public String getGoods() {
        List<Spu> spus = goodsService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String rs = mapper.writeValueAsString(spus);
            System.out.println(rs);
            return  rs;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "0";
    }

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
        return "0";
    }

    @RequestMapping("/selectCatalog")
    public String selectCatalog() {
        List<Catalog1VO> catalog1VOS = catalogService.getCatalog();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String temp = mapper.writeValueAsString(catalog1VOS);
            String rs = temp.replaceAll("id", "value").replaceAll("name", "label");

            System.out.println(rs);
            return rs;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "0";
    }
    @RequestMapping("/addCatalog")
    public String addCatalog(@RequestParam(value = "level", required = false) String level, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "pid", required = false) String pid) {
        System.out.println(level);

        System.out.println(name);

        System.out.println(pid);

        Integer row = catalogService.addCatalog(level, name, pid);
        if (row != 1) {
            return "0";
        } else {
            return "1";
        }

    }
    @RequestMapping("/deleteCatalog")
    public String deleteCatalog(@RequestParam(value = "level", required = false) String level,@RequestParam(value = "id", required = false) String id) {
        System.out.println(level);
        System.out.println(id);
        Integer row=-1;
        row = catalogService.deleteCatalog(level, id);
        if (row != 1) {
            System.out.println("添加失败");
            return "0";
        } else {
            System.out.println("添加成功！");
            return "1！";
        }

    }

    @RequestMapping("/addSkuModel")
    public String addSkuModel(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "catalog3Id", required = false) String catalog3) {
        SkuModel skuModel = new SkuModel();

        skuModel.setName(name);
        skuModel.setCatalog3Id(Integer.parseInt(catalog3));

        Integer row = skuModelService.addSkuModel(skuModel);
        if (row == 1) {
            return "1";
        } else {
            return "0";
        }
    }

    @RequestMapping("/selectSkuModel")
    public String selectSkuModel() {

        List<SkuModelVO> skuModelVO = skuModelService.selectAllVO();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String rs = mapper.writeValueAsString(skuModelVO);
            System.out.println(rs);
            return rs;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "0";
    }

    @RequestMapping("/deleteSkuModel")
    public String deleteSkuModel(@RequestParam(value = "id", required = false) String id) {
       Integer row =  skuModelService.delete(Integer.parseInt(id));
        if (row == 1) {
            return "1";
        } else {
            return "0";
        }
    }



}
