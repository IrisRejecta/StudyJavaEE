package com.study.test;

/**
 * 数组遍历-求和
 * 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:51
 */
public class ArrayTestDemo1 {
    public static void main(String[] args) {

        int[] sales = {16, 26, 36, 6, 100};

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        System.out.println("总销售额为：" + sum);
    }

}