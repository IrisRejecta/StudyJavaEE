package com.study.param;

/**
 * 比较两个数组内容是否一样-方法的参数传递案例
 * 需求：定义一个方法，比较两个数组内容是否一样，如果一样返回true，否则返回false
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 01:33
 */
public class MethodTestDemo5 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};
        int[] arr3 = {11, 22, 33, 44, 55, 66};
        System.out.println(isEqual(arr1, arr2));
        System.out.println(isEqual(arr1, arr3));
    }
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}