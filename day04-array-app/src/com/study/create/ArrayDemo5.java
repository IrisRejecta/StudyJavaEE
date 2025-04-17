package com.study.create;

/**
 * 了解动态初始化数组的默认值
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:33
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        // 1、整数数组的元素默认值是0
        int[] number = new int[2];
        System.out.println("整数型默认值");
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
        // 2、字符数组的元素默认值是\u0000，强转后也是0
        char[] chars = new char[2];
        System.out.println("字符型默认值，需要强转");
        for (int i = 0; i < chars.length; i++){
            System.out.println((int)chars[i]);
        }
        // 3、浮点数组的元素默认值是0.0
        double[] doubles = new double[2];
        System.out.println("浮点型默认值");
        for (int i = 0; i < doubles.length; i++){
            System.out.println(doubles[i]);
        }
        // 4、布尔数组的元素默认值是false
        boolean[] booleans = new boolean[2];
        System.out.println("布尔型默认值");
        for (int i = 0; i < booleans.length; i++){
            System.out.println(booleans[i]);
        }
        // 5、引用数组的元素默认值是null
        String[] strings = new String[2];
        System.out.println("引用型默认值");
        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}