package com.cy.project.ssm.web;

import com.cy.project.ssm.service.CatalogService;
import com.cy.project.ssm.viewobject.Catalog1VO;
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

//    @ResponseBody
    @RequestMapping("/getCatalog")
    public String getCatalog() {
        List<Catalog1VO> catalog1VOS = catalogService.getCatalog();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String rs = mapper.writeValueAsString(catalog1VOS);
//            System.out.println(rs);
            return  rs;

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "请求数据失败";
    }

    @RequestMapping("/addCatalog")
    public String addCatalog(@RequestParam(value = "level", required = false) String level, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "pid", required = false) String pid) {
        System.out.println(level);

        System.out.println(name);

        System.out.println(pid);

        Integer row = catalogService.addCatalog(level, name, pid);
        if (row != 1) {
            return "添加失败";
        } else {
            return "添加成功！";
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
            return "添加失败";
        } else {
            System.out.println("添加成功！");
            return "添加成功！";
        }

    }


}
