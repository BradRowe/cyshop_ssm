package com.cy.project.ssm.service;

import com.cy.project.ssm.viewobject.OrderVO;

import java.util.List;

public interface OrderVOService {
    List<OrderVO> selectAll();
    OrderVO selectOneByOrderId(int orderId);
}
