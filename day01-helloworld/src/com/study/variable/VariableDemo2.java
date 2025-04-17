package com.study.variable;

/**
 * 学习变量使用时的注意事项
 * <p>
 * 详细说明变量声明、初始化和使用的相关规范
 *
 * @author w1170
 * @version 1.0
 * @since 2025-04-12
 */
public class VariableDemo2 {

    public static void main(String[] args) {
        // 1、什么类型的变量一定是存放什么类型的数据
        int a = 21;
        double b = 3.14;
        System.out.println(a);
        System.out.println(b);
        // 2、同一个范围内不能定义重名的变量
        int age = 18;
        System.out.println(age);
        int age1 = 19;
        // 可以赋值不能有同名变量
        System.out.println(age1);
        age1 = 20;
        System.out.println(age1);

        // 3、变量定义的时候可以不给初始化值，但是使用的时候必须有
        int c;
        // System.out.println(c); 报错
        c = 100;
        System.out.println(c);
    }

}