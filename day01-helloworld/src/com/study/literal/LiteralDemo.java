package com.study.literal;

/**
 * 学习字面量-即如何在Java中定义数据
 *
 * @author w1170
 * @version 1.0
 * @since 2025-04-12
 */
public class LiteralDemo {
    public static void main(String[] args) {
        // 1、整数
        System.out.println(66);
        System.out.println(-23);
        // 2、浮点数
        System.out.println(99.5);
        // 3、字符
        System.out.println('中');
        // 换行符
        System.out.println('\n');
        // TAB缩进
        System.out.println('\t');
        // 4、字符串
        System.out.println("你好");
        System.out.println("特殊\n字符");
        System.out.println("特殊\t字符");

        // 5、布尔值
        System.out.println(true);
        System.out.println(false);
        // 6、null
        System.out.println("后面介绍null");
    }

}