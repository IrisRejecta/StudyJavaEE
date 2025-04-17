package com.study.test;

/**
 * 数组排序--就是对数组中的元素，进行升序(由小到大)或者降序（由大到小）的操作
 *
 * 数组排序技术：
 * 冒泡排序--选择排序--插入排序--快速排序--归并排序--基数排序等等
 *
 * 数组搜索相关的技术：
 * 二分搜索--分块查找--哈希表查找等等
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 19:32
 */
public class ArrayTestDemo5 {
    public static void main(String[] args) {
        // 冒泡排序思想--每次从数组中找出最大值放在数组的后面去。
        // 1、定义一个数组，存储一些随机大小的数据
        int[] number = {5,2,3,1,4};
        //              0 1 2 3 4

        // 2、定义一个循环控制比较的轮次
        for (int i = 0; i < number.length - 1; i++) {
            // 3、定义一个循环控制比较的次数，第一轮将比较索引01，12，23，34四次
            for (int j = 0; j < number.length - 1 - i; j++){
                // 判断j当前位置的元素值，是否大于后一个位置，如果大于，则交换位置
                if (number[j] > number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+"\t");
        }
    }
}