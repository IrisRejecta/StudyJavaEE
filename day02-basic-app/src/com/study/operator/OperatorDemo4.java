package com.study.operator;

/**
 * 学会使用自增自减运算符
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 05:31
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        // 先输出再自增
        System.out.println(a++);
        // 先自增后输出
        System.out.println(++a);

        int b = 10;
        // 先输出再自减
        System.out.println(b--);
        // 先自减后输出
        System.out.println(--b);

        System.out.println("------------------运算存在先后顺序-------------------");
        int c = 10;
        int d = c++;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = ++c;
        System.out.println("c = " + c);
        System.out.println("e = " + e);

        System.out.println("------------------自增自减案例-------------------");
        int i = 10;
        int g = 5;
        int rs = i++ + ++i - --g - ++g +1 + i--;
         // i = 11
         // g = 5
         // rs = 10 + 12 - 4 - 5 + 1 + 12 = 26
        System.out.println("rs = " + rs);
        System.out.println("i = " + i);
        System.out.println("g = " + g);
    }

}