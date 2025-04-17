package com.study.test;

/**
 * 数组元素求最值
 * 需求: 在数组元素中找出最大值
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:56
 */
public class ArrayTestDemo2 {
    public static void main(String[] args) {
        int[] number = {112, 43122, 21412343, 412312, 5213123, 214126, 75123, 85123, 9213, 101111};

        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}