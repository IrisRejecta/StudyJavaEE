package com.study.param;

/**
 * 从数组中查询指定元素的索引-方法的参数传递案例
 * 需求：设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中
 * 不存在该元素则返回-1。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 01:29
 */
public class MethodTestDemo4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int index = getIndex(arr, 11);
        System.out.println(index);
    }
    public static int getIndex(int[] arr, int num){
        if (arr == null || arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

}