package com.study.create;

/**
 * 学习方法的定义使用
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 21:32
 */
public class MethodDemo1 {

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

    // 求两数之和
    public static int sum(int a, int b) {
        return a + b;
    }
}