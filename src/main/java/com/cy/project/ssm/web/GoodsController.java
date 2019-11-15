package com.cy.project.ssm.web;

import com.cy.project.ssm.TO.SkuMatchTO;
import com.cy.project.ssm.domain.*;
import com.cy.project.ssm.mapper.SkuAttriGroupMapper;
import com.cy.project.ssm.mapper.SkuAttriMapper;
import com.cy.project.ssm.mapper.SkuAttriValueMapper;
import com.cy.project.ssm.mapper.SkuModelMapper;
import com.cy.project.ssm.service.CatalogService;
import com.cy.project.ssm.service.GoodsService;
import com.cy.project.ssm.service.SkuModelService;
import com.cy.project.ssm.viewobject.Catalog1VO;
import com.cy.project.ssm.viewobject.SkuModelVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
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
    @Autowired
    private SkuAttriMapper skuAttriMapper;
    @Autowired
    private SkuAttriValueMapper skuAttriValueMapper;
    @Autowired
    private SkuModelMapper skuModelMapper;
    @Autowired
    private SkuAttriGroupMapper skuAttriGroupMapper;

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

    /**
     * TODO 已获得参数，需要执行插入数据
     *
     * @param attris
     * @return
     */
    @RequestMapping("/addSkuAttri")
    public String addSkuAttri(@RequestParam(value = "attris") String attris, @RequestParam(value = "matchs") String matchs) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<String> attri = mapper.readValue(attris, new TypeReference<List<String>>() {
        });
        List<SkuMatchTO> match = mapper.readValue(matchs, new TypeReference<List<SkuMatchTO>>() {
        });

        List<Integer> attriId = new ArrayList<>();
        for (String a : attri) {
            SkuAttri skuAttri = new SkuAttri();
            skuAttri.setName(a);
            skuAttriMapper.insert(skuAttri);
            attriId.add(skuAttri.getId());
        }


        addSkuAttriValue(attriId, match);

        return "";

    }

    public String addSkuAttriValue(List<Integer> skuAttriId, List<SkuMatchTO> matches) {
        List<Integer> attriValueId = new ArrayList<>();
        for (Integer id : skuAttriId) {
            SkuAttri skuAttri = new SkuAttri();
            skuAttri.setId(id);
            List<SkuAttri> attris = skuAttriMapper.select(skuAttri);
            String name = attris.get(0).getName();

            for (SkuMatchTO to : matches) {
                if (to.getAttri().equals(name)) {
                    SkuAttriValue skuAttriValue = new SkuAttriValue();
                    skuAttriValue.setAttriId(id);
                    skuAttriValue.setValue(to.getValue());
                    skuAttriValueMapper.insert(skuAttriValue);
                    attriValueId.add(skuAttriValue.getId());
                    continue;
                }

            }

        }
//        System.out.println(attriValueId);
        addSkuModel(attriValueId);
        return "";
    }

    public String addSkuModel(List<Integer> attriValueId) {
        Integer modelId = skuModelService.getLastId();

        for (Integer i : attriValueId) {
            SkuAttriValue skuAttriValue = new SkuAttriValue();
            skuAttriValue.setId(i);
            SkuAttriValue skuAttriValue1= skuAttriValueMapper.select(skuAttriValue).get(0);
            SkuAttriGroup skuAttriGroup = new SkuAttriGroup();
            skuAttriGroup.setModelId(modelId);
            skuAttriGroup.setAttriValueId(skuAttriValue1.getId());
            skuAttriGroup.setAttriId(skuAttriValue1.getAttriId());
            skuAttriGroupMapper.insert(skuAttriGroup);
        }
//      skuAttriValueMapper.select()


        return "";
    }



}
