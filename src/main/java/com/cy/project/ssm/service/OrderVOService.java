package com.cy.project.ssm.service;

import com.cy.project.ssm.viewobject.OrderVO;
import com.cy.project.ssm.viewobject.OrderVOC;

import java.util.List;

public interface OrderVOService {

    List<OrderVO> selectAll();

    OrderVO selectOrderById(int orderId);

    int changeOrderStatus(String id, String status);
}
