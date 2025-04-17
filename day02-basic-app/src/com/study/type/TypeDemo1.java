package com.study.type;

/**
 * 学习自动类型转换知识-赋值下的自动类型转换
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 04:06
 */
public class TypeDemo1 {
    public static void main(String[] args) {
        byte a = 127;
        // 赋值时发生了自动类型转换
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int in = 18;
        double db = in;
        System.out.println(db);

        char ch = 'a';
        // a的ASCII码是97,二进制是00000000 01100001
        int code = ch;
        // 自动类型转换，二进制变为00000000 00000000 00000000 01100001
        System.out.println(code);
    }
}