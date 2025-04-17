package com.study.operator;

import java.util.Scanner;

/**
 * 三元运算符案例-求三个整数的最大值
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 08:04
 */
public class OperatorTest9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int temp = a > b ? a: b;
        int final_max = temp > c ? temp : c;
        System.out.println("三个整数的最大值为：" + final_max);

        // 嵌套
        System.out.println("---------拓展方式三元运算符嵌套---------");
        int max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("三个整数的最大值(嵌套方式)为：" + max);
        scanner.close();

    }

}