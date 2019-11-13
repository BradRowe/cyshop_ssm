package com.cy.project.ssm.mapper;

import com.cy.project.ssm.viewobject.RefundVO;

import java.util.List;

public interface RefundVOMapper {
    List<RefundVO> selectAll();

    RefundVO selectOneByOrderId(int orderId);

    int changeRefundStatus(String id, String status);
}
