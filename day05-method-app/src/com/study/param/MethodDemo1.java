package com.study.param;

/**
 * 理解Java的基本类型的参数传递：值传递
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 23:40
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
    public static void change(int a) {
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}