package com.study.operator;

import java.util.Scanner;

/**
 *  算数运算符案例
 *  需求：一个三位数，将其拆分为个位、十位、百位后，打印在控制台
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 05:05
 */
public class OperatorTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = scanner.nextInt();
        if (num > 99 && num < 1000) {
            int bai_wei = num / 100;
            int shi_wei = num / 10 % 10;
            int ge_wei = num % 10;
            System.out.println("百位：" + bai_wei);
            System.out.println("十位：" + shi_wei);
            System.out.println("个位：" + ge_wei);
        }else {
            System.out.println("您输入的数字有误");
        }
    }

}