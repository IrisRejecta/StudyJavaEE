package com.study.create;

/**
 * 学习方法的完整定义格式，并理解其调用
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 15:50
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int res = add(100,200);
        System.out.println(res);
    }
    public static  int add(int a, int b){
        int c = a + b;
        return c;
    }
}