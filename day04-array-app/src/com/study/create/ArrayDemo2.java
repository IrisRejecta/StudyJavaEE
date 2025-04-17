package com.study.create;

/**
 * 学会数组的访问
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:02
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};

        // 取值: 数组名称[索引]
        System.out.println(number[0]);

        // 赋值
        number[0] = 100;
        System.out.println(number[0]);

        // 访问数组的长度
        System.out.println(number.length);

        // 数组的最大索引 前提-数组长度大于0即最起码有一个元素
        System.out.println(number.length - 1);
    }
}