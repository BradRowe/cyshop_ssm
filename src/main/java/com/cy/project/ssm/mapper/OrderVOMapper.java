package com.cy.project.ssm.mapper;

import com.cy.project.ssm.viewobject.OrderVO;
import com.cy.project.ssm.viewobject.OrderVOC;

import java.util.List;

public interface OrderVOMapper {

    List<OrderVO> selectAll();

    List<OrderVO> selectOrderById(int orderId);

    List<OrderVOC> selectOrderCById(int orderId);

    int changeOrderStatus(String id, String status);
}
