package com.cy.project.ssm.service.impl;

import com.cy.project.ssm.mapper.RefundVOMapper;
import com.cy.project.ssm.service.RefundVOService;
import com.cy.project.ssm.viewobject.RefundVO;
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
public class RefundVOServiceImpl implements RefundVOService {

    @Autowired
    private RefundVOMapper refundVOMapper;

    @Override
    public List<RefundVO> selectAll() {
        List<RefundVO> rvos = refundVOMapper.selectAll();
        List<RefundVO> rVOs = new ArrayList<>();
        for (RefundVO rvo : rvos){
            switch (rvo.getRStatus()){
                case "0":
                    rvo.setRStatus("未处理");
                    break;
                case "1":
                    rvo.setRStatus("已通过");
                    break;
                case "2":
                    rvo.setRStatus("已完成");
                    break;
                default:
                    rvo.setRStatus("已撤销");
                    break;
            }
            rVOs.add(rvo);
        }
        return rVOs;
    }

    @Override
    public RefundVO selectOneByOrderId(int orderId) {
        return refundVOMapper.selectOneByOrderId(orderId);
    }

    @Override
    public int changeRefundStatus(String id, String status) {
        return refundVOMapper.changeRefundStatus(id,status);
    }

}
