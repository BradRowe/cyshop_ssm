package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.mapper.RefundVOMapper;
import com.cy.project.ssm.service.RefundVOService;
import com.cy.project.ssm.viewobject.RefundVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class RefundVOServiceImpl implements RefundVOService {

    @Autowired
    private RefundVOMapper refundVOMapper;

    @Override
    public List<RefundVO> selectAll() {
        return refundVOMapper.selectAll();
    }

    @Override
    public RefundVO selectOneByOrderId(int orderId) {
        return refundVOMapper.selectOneByOrderId(orderId);
    }
}
