package com.study.scanner;


// 1、导包: java.util.Scanner
import java.util.Scanner;

/**
 * Scanner键盘输入案例
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 08:21
 */
public class ScannerDemo {

    public static void main(String[] args) {
        // 2、创建一个Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("你的年龄是多少？");
        // 3、调用对象方法nextInt()获取键盘输入的整数
        int age = scanner.nextInt();
        System.out.println("你的年龄是：" + age);
        // 4、调用对象方法close()关闭Scanner对象
        scanner.close();
    }
}