package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.mapper.OrderVOMapper;
import com.cy.project.ssm.service.OrderVOService;
import com.cy.project.ssm.viewobject.OrderVO;
import com.cy.project.ssm.viewobject.OrderVOC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhy
 * @version 1.0.0
 * @function TODO
 * @date 2019年9月4日下午3:01:42
 * @place 工作地点
 * @remarks TODO
 */
@Service
public class OrderVOServiceImpl implements OrderVOService {

    @Autowired
    private OrderVOMapper orderVOMapper;

    /**
     * 查询所有订单
     * @return
     */
    @Override
    public List<OrderVO> selectAll() {
        List<OrderVO> ovos = orderVOMapper.selectAll();
        List<OrderVO> oVOs = new ArrayList<>();
        for (OrderVO oVO : ovos){
            String orderStatus = "";
//            OrderVO ovo = new OrderVO();
//            ovo.setOrderId(oVO.getOrderId());
//            ovo.setMemberName(oVO.getMemberName());
//            ovo.setConsigneeName(oVO.getConsigneeName());
//            ovo.setTotalPrice(oVO.getTotalPrice());
//            ovo.setPostPrice(oVO.getPostPrice());
//            ovo.setPaymentWay(oVO.getPaymentWay());
//            ovo.setPayment(oVO.getPayment());
            switch (oVO.getOrderStatus()){
                case "0":
                    orderStatus = "已取消";
                    break;
                case "1":
                    orderStatus = "未付款";
                    break;
                case "2":
                    orderStatus = "已付款";
                    break;
                case "3":
                    orderStatus = "已发货";
                    break;
                case "4":
                    orderStatus = "已收货";
                    break;
                default:
                    orderStatus = "已失效";
                    break;
            }
//            ovo.setOrderStatus(orderStatus);
//            ovo.setPayment(oVO.getPayment());
//            ovo.setCreateTime(oVO.getCreateTime());
//            oVOs.add(ovo);
            oVO.setOrderStatus(orderStatus);
            oVOs.add(oVO);
        }
        return oVOs;
    }

    /**
     * 根据 id 查找订单
     * @param orderId
     * @return
     */
    @Override
    public OrderVO selectOrderById(int orderId) {
        OrderVO ovos = orderVOMapper.selectOrderById(orderId);
        List<OrderVOC> ovocs = orderVOMapper.selectOrderCById(orderId);
//        List<OrderVO> oVOs = new ArrayList<>();
//        for(OrderVO ovo : ovos){
            String orderStatus = "";
//            OrderVO oVO = new OrderVO();
//            oVO.setOrderId(ovo.getOrderId());
//            oVO.setConsigneeName(ovo.getConsigneeName());
//            oVO.setCreateTime(ovo.getCreateTime());
//            oVO.setMemberName(ovo.getMemberName());
//            oVO.setTotalPrice(ovo.getTotalPrice());
//            oVO.setPostPrice(ovo.getPostPrice());
//            oVO.setPayment(ovo.getPayment());
            switch (ovos.getOrderStatus()){
                case "0":
                    orderStatus = "已取消";
                    break;
                case "1":
                    orderStatus = "未付款";
                    break;
                case "2":
                    orderStatus = "已付款";
                    break;
                case "3":
                    orderStatus = "已发货";
                    break;
                case "4":
                    orderStatus = "已收货";
                    break;
                default:
                    orderStatus = "已失效";
                    break;
            }
//            oVO.setOrderStatus(orderStatus);
//            oVO.setPaymentWay(ovo.getPaymentWay());
//            oVO.setAccount(ovo.getAccount());
//            oVO.setPhone(ovo.getPhone());
//            oVO.setConsigneePhone(ovo.getConsigneePhone());
//            oVO.setPaymentTime(ovo.getPaymentTime());
//            oVO.setConsigneeAddress(ovo.getConsigneeAddress());
//            oVO.setChildren(ovocs);
        ovos.setOrderStatus(orderStatus);
        ovos.setChildren(ovocs);
//            oVOs.add(oVO);
//        }
//        return oVOs;
        return ovos;

    }

    /**
     * 根据 id 更新订单状态
     * @param id
     * @param status
     * @return
     */
    @Override
    public int changeOrderStatus(String id, String status) {
        int result = orderVOMapper.changeOrderStatus(id,status);
        return result;
    }
}
