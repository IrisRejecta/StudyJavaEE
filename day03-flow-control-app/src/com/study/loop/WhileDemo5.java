package com.study.loop;

/**
 * 学习使用while循环
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 10:10
 */
public class WhileDemo5 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5){
            System.out.println("HelloWorld!"+i);
            i++;
        }
        // 死循环
//        while (true){
//            System.out.println("死循环");
//        }
    }
}