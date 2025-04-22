package com.study.create;

/**
 * 把找出数组的最大值案例，改造成方法，可以支持返回任意整型数组的最大值数据。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 17:36
 */
public class MethodTestDemo6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 612, 7, 8, 9, 10};
        int max = getMax(arr);
        System.out.println(max);

    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}