package com.study.test;

/**
 * 理解2个数组变量指向同一个数组对象
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 20:27
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[1] = 100;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);
    }

}