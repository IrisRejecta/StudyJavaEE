package com.study.operator;

/**
 * 掌握基本的算数运算符的使用：+ - * / %
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 05:00
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        // 除法，在Java中两个整数相除结果还是整数
        System.out.println(a / b);
        System.out.println(a*1.0/b);
        System.out.println(a/b*1.0);
        // 取余数
        System.out.println(a % b);
    }
}