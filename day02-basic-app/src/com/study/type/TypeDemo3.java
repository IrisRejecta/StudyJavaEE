package com.study.type;

/**
 * 强制类型转换-大范围转小范围
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 04:38
 */
public class TypeDemo3 {
    public static void main(String[] args) {
        int a = 18;
        byte b = (byte) a;
        System.out.println(b);

        // 1500超出了byte的范围，所以会进行强制类型转换，超出部分会被截断,出现丢失
        int in = 1500;
        byte by = (byte) in;
        System.out.println(by);

        // 浮点型强转成整型，直接丢掉小数部分，保留整数部分返回
        double d = 12.3;
        int i = (int) d;
        System.out.println(i);
    }
}