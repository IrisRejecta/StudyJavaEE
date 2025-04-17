package com.study.create;

/**
 * 学会静态初始化数组的方式定义数组
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 17:48
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 完整格式：数据类型[] 数组名 = new 数据类型[] {元素1,元素2,元素3,...};
        double[] db = new double[] {1.1, 2.2, 3.3, 4.4};

        String[] Str = new String[] {"你好", "Hello", "World", "！"};

        int[] in = new int[] {1, 2, 3, 4};

        // 简化格式：数据类型[] 数组名 = {元素1,元素2,元素3,...};
        double[] db2 = {1.1, 2.2, 3.3, 4.4};

        String[] Str2 = {"你好", "Hello", "World", "！"};

        int[] in2 = {1, 2, 3, 4};


        // 理解数组的底层原理-->数组名就是数组的地址
        System.out.println(db);
    }
}