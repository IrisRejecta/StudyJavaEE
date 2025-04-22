package com.study.param;

/**
 * 理解引用类型的参数传递机制：值传递，区分不同点
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 23:44
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[0]);
    }

    /**
     * 值传递，引用类型传递的是地址（即arr变量存储的是地址值），所以修改arr[0]，arr[0]也会改变
     * @param arr
     */
    public static void change(int[] arr) {
        System.out.println(arr[0]);
        arr[0] = 100;
        System.out.println(arr[0]);
    }

}