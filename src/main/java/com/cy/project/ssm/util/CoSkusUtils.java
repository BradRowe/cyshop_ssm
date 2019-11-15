package com.cy.project.ssm.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName CoSkusUtils
 * @Description sku组合工具类
 * @Author 吴桐
 * @date 2019/11/1515:57
 */
public class CoSkusUtils {
    /**
     * 用来组合sku搭配
     * @param attriNames 属性名集合 长度为n
     * @param values 属性值集合（长度不定）的数组 数组长度n
     * @return
     */
    public static List<String[]> coSkus(List<String> attriNames, List<String>[] values) {
        List<String[]> coSkus = new ArrayList<>();
        int layer = values.length;
        switch (layer) {
            case 1:

                for (String str : values[0]) {
                    String[] coSku = {attriNames.get(0)+":"+str};
                    coSkus.add(coSku);
                }

                break;
            case 2:
                for (String str1 : values[0]) {
                    for (String str2 : values[1]) {
                        String[] coSku = {attriNames.get(0)+":"+str1,attriNames.get(1)+":"+str2};
                        coSkus.add(coSku);
                    }
                }
                break;
            case 3:
                for (String str1 : values[0]) {
                    for (String str2 : values[1]) {
                        for (String str3 : values[2]) {
                            String[] coSku = {attriNames.get(0)+":"+str1,attriNames.get(1)+":"+str2,attriNames.get(2)+":"+str3};
                            coSkus.add(coSku);
                        }
                    }
                }
                break;
            case 4:
                for (String str1 : values[0]) {
                    for (String str2 : values[1]) {
                        for (String str3 : values[2]) {
                            for (String str4 : values[3]) {
                                String[] coSku = {attriNames.get(0)+":"+str1,attriNames.get(1)+":"+str2,attriNames.get(2)+":"+str3,attriNames.get(3)+":"+str4};
                                coSkus.add(coSku);
                            }
                        }
                    }
                }
                break;
            case 5:
                for (String str1 : values[0]) {
                    for (String str2 : values[1]) {
                        for (String str3 : values[2]) {
                            for (String str4 : values[3]) {
                                for (String str5 : values[4]) {
                                    String[] coSku = {attriNames.get(0)+":"+str1,attriNames.get(1)+":"+str2,attriNames.get(2)+":"+str3,attriNames.get(3)+":"+str4,attriNames.get(4)+":"+str5};
                                    coSkus.add(coSku);
                                }
                            }
                        }
                    }
                }
                break;

        }


        return coSkus;
    }
}
