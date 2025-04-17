package com.study.create;

/**
 * 数组的几个注意事项
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:10
 */
public class ArrayAttentionDemo3 {
    public static void main(String[] args) {

        // 1、数据类型[] 数组名 也可以写作  数据类型 数组名[]
        int[] number = {1, 2, 3, 4};
        int number2[] = {11, 22, 33, 44};

        // 2、什么类型的数组存放什么类型的数据，否则报错
        // int[] number3 = {1, 2, 3, "4"};

        // 3、数组一旦定义出来，程序执行的过程中，长度、类型就固定了
        // System.out.println(number[4]);  // 此处越界，定义好的数组，使用时应注意其类型长度
    }

}