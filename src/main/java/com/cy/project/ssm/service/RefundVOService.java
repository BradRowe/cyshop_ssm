package com.cy.project.ssm.service;

import com.cy.project.ssm.viewobject.RefundVO;

import java.util.List;

public interface RefundVOService {

    List<RefundVO> selectAll();

    RefundVO selectOneByOrderId(int orderId);

    int changeRefundStatus(String id, String status);
}
