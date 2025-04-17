package com.study.create;

/**
 * 学会动态初始化数组的定义和使用
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:23
 */
public class ArrayDemo4 {

    public static void main(String[] args) {

        double[] scores = new double[3];
        // 动态初始化数组具有默认值，[0.0,0.0,0.0]
        System.out.println(scores[1]);
        // 赋值
        scores[0] = 100.0;
        System.out.println(scores[0]);


        String[] names = new String[10];
        // 动态初始化数组具有默认值，[null,null,...]
        System.out.println(names[0]);
        names[0] = "张三";
        System.out.println(names[0]);

    }
}