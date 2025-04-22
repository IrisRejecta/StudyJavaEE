package com.study.create;

/**
 * 案例-计算1到n的和返回
 * 需求：定义一个方法，方法中计算出1到n的和并返回
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 17:30
 */
public class MethodTestDemo4 {
    public static void main(String[] args) {
        int res = sum(11);
        System.out.println(res);
    }
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}