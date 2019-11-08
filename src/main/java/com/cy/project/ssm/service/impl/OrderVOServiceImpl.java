package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.mapper.OrderVOMapper;
import com.cy.project.ssm.service.OrderVOService;
import com.cy.project.ssm.viewobject.OrderVO;
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
public class OrderVOServiceImpl implements OrderVOService {
    @Autowired
    private OrderVOMapper orderVOMapper;

    @Override
    public List<OrderVO> selectAll() {
        return orderVOMapper.selectAll();
    }

    @Override
    public OrderVO selectOneByOrderId(int orderId) {
        return orderVOMapper.selectOneByOrderId(orderId);
    }
}
