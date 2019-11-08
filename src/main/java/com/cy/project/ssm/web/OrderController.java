package com.cy.project.ssm.web;

import com.cy.project.ssm.service.OrderVOService;
import com.cy.project.ssm.service.RefundVOService;
import com.cy.project.ssm.viewobject.OrderVO;
import com.cy.project.ssm.viewobject.RefundVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhy
 * @version 1.0.0
 * @function TODO
 * @date 2019年9月4日下午3:01:42
 * @place 工作地点
 * @remarks TODO
 */

@RestController
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderVOService orderVOService;
    @Autowired
    private RefundVOService refundVOService;

    @RequestMapping("/getOrderList")
    private String getOrderAll(){
        List<OrderVO> orderVOs = orderVOService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String orderVOsJ = mapper.writeValueAsString(orderVOs);
            System.out.println(orderVOsJ);
            return orderVOsJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }

    @RequestMapping("/getRefundList")
    private String getRefundAll(){
        List<RefundVO> refundVOs = refundVOService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String refundVOsJ = mapper.writeValueAsString(refundVOs);
            System.out.println(refundVOsJ);
            return refundVOsJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }

    @RequestMapping("/getRefundDetails")
    private String getOrderForOne(@RequestParam(value="row",required = false) String id){
        System.out.println(id);
        int idInt = Integer.parseInt(id);
        OrderVO orderVO = orderVOService.selectOneByOrderId(idInt);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String orderVOJ = mapper.writeValueAsString(orderVO);
            System.out.println(orderVOJ);
            return orderVOJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }

    @RequestMapping("/getOrderDetails")
    private String getRefundForOne(@RequestParam(value="row",required = false) String id){
        System.out.println(id);
        int idInt = Integer.parseInt(id);
        RefundVO refundVO = refundVOService.selectOneByOrderId(idInt);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String refundVOJ = mapper.writeValueAsString(refundVO);
            System.out.println(refundVOJ);
            return refundVOJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }
}
