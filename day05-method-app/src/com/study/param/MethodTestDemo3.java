package com.study.param;

/**
 * 打印数组内容-方法的参数传递案例
 * 需求：设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
 * “该数组内容为：[11，22，33，44，55]”
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 00:53
 */
public class MethodTestDemo3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        getArray(arr);
    }
    public static void getArray(int[] arr) {
        System.out.print("该数组内容为：[");
        if (arr.length > 0 && arr != null){
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i] + "]");
                } else {
                    System.out.print(arr[i] + ",");
                }
            }
        }
    }

}