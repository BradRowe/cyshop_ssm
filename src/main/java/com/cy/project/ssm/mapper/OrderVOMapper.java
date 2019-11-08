package com.cy.project.ssm.mapper;

import com.cy.project.ssm.viewobject.OrderVO;

import java.util.List;

public interface OrderVOMapper {

    List<OrderVO> selectAll();

    OrderVO selectOneByOrderId(int orderId);
}
