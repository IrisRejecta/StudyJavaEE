package com.study.type;

/**
 * 学习表达式中的数据类型转换
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 04:31
 */
public class TypeDemo2 {

    public static void main(String[] args) {
        // byte short char在表达式中直接转换为int类型进行运算
        byte a = 127;
        byte b = 11;
        int in = a+b;
        System.out.println(in);

        //表达式的最终结果类型由表达式中的最高类型决定
        byte c = 127;
        int d = 11;
        double db = 12.0;
        System.out.println(c+d+db);

        // 面试题： int接收byte short char类型，会自动类型转换，
        // 或者强制类型转换为相应的byte short char
        byte e = 12;
        byte f = 11;
        byte g = (byte)(e+f);
        System.out.println(g);

    }
}