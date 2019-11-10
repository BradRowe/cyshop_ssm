package com.cy.project.ssm.web;

import com.cy.project.ssm.service.OrderVOService;
import com.cy.project.ssm.service.RefundVOService;
import com.cy.project.ssm.viewobject.OrderVO;
import com.cy.project.ssm.viewobject.RefundVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 后期前端获取订单列表
     * @return
     */
    @RequestMapping("/getOrderList")
    private String getOrderAll(){
        List<OrderVO> orderVOs = orderVOService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String orderVOsJ = mapper.writeValueAsString(orderVOs);
            return orderVOsJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "0";
    }

    /**
     * 后台前端获取退货款单列表
     * @return
     */
    @RequestMapping("/getRefundList")
    private String getRefundAll(){
        List<RefundVO> refundVOs = refundVOService.selectAll();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String refundVOsJ = mapper.writeValueAsString(refundVOs);
            return refundVOsJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "0";
    }

    /**
     * 改变订单状态
     * @param id
     */
    @ResponseBody
    @RequestMapping("/changOrderStatus")
    private String changOrderStatus(
            @RequestParam(value="id",required = false) String id,
            @RequestParam(value="status",required = false) String status
            ){
        int result = orderVOService.changeOrderStatus(id,status);
        if(result == 1){
            return "1";
        }else{
            return "2";
        }
    }

    /**
     * 后台前端获取订单详情数据
     * @param id
     * @return
     */
    @RequestMapping("/getOrderDetails")
    private String getOrderForOne(
            @RequestParam(value="id",required = false) String id
    ){
        int idInt = Integer.parseInt(id);
        List<OrderVO> orderVOCs = orderVOService.selectOrderById(idInt);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String orderVOCJ = mapper.writeValueAsString(orderVOCs);
            return orderVOCJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }

    /**
     * 后台前端获取退货款单详情
     * @param id
     * @return
     */
    @RequestMapping("/getRefundDetails")
    private String getRefundForOne(@RequestParam(value="id",required = false) String id){
        int idInt = Integer.parseInt(id);
        RefundVO refundVO = refundVOService.selectOneByOrderId(idInt);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String refundVOJ = mapper.writeValueAsString(refundVO);
            return refundVOJ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "暂无数据";
    }

    /**
     * 根据订单id和原状态更新状态
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/changeRefundStatus")
    private String changeRefundStatus(
            @RequestParam(value="id",required = false) String id,
            @RequestParam(value="status",required = false) String status
    ){
        System.out.println(id);
        System.out.println(status);
        int result = refundVOService.changeRefundStatus(id,status);
        if(result == 1){
            return "1";
        }else{
            return "2";
        }
    }
}
