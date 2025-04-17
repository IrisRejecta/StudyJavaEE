package com.study.operator;

/**
 * 学会使用赋值运算符
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 05:58
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        // a = a + b;
        a += b;
        System.out.println(a);
        System.out.println(b);

        byte c = 10;
        byte d = 20;
        // c = (byte) (c + d)
        c += d;
        System.out.println(c);
    }

}