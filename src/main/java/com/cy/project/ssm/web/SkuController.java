package com.cy.project.ssm.web;

import com.cy.project.ssm.domain.Sku;
import com.cy.project.ssm.service.SkuSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: SkuController
 * @Description:
 * @Author: 罗海
 * @Date: 2019/11/8 10:14
 **/
@RestController
@CrossOrigin("*")
public class SkuController {

    @Autowired
    private SkuSerice skuSerice;

    /**
     * 发送所有库存信息到web页面
     * @return
     */
    @ResponseBody
    @RequestMapping("/skuByAll.vue")
    public List<Sku> skuByAll(){
        return skuSerice.skuAndAll();
    }

    /**
     * 商品状态更改
     * 从web端获取id，商品状态，进行数据库操作
     * @param id
     * @param skuStatus
     * @return
     */
    @RequestMapping("/skuByIdAndStatus.vue")
    public boolean skuByIdAndStatus(@RequestParam(value = "id" ,required = false) String id,
                        @RequestParam(value = "status" ,required = false) String skuStatus)
    {
//      将接收的String类型转换为int类型
        int idInt = Integer.parseInt(id);
        int skuStatusInt = Integer.parseInt(skuStatus);

        boolean num = skuSerice.skuByIdAndSkustatus(idInt,skuStatusInt);

        return false;
    }

    /**
     * 商品信息更改
     * 从web前端获取id，价格，库存，库存预警信息，进行数据库操作
     * @param id
     * @param price
     * @param stock
     * @param stockWarning
     * @return
     */
    @RequestMapping("/skuByIdAndPriceStockStockwarning.vue")
    public boolean skuByIdAndPriceStockStockwarning(@RequestParam(value = "id",required = false) String id,
                                                    @RequestParam(value = "price" ,required = false) String price,
                                                    @RequestParam(value = "stock" ,required = false) String stock,
                                                    @RequestParam(value = "stockWarning",required = false) String stockWarning)
    {
//      将接收的String类型转换为int类型
        int idInt = Integer.parseInt(id);
        int priceInt = Integer.parseInt(price);
        int stockInt = Integer.parseInt(stock);
        int stockWarningInt = Integer.parseInt(stockWarning);

        boolean num = skuSerice.skuByIdAndPriceStockStockwarning(idInt,priceInt,stockInt,stockWarningInt);

        return num;
    }



}
