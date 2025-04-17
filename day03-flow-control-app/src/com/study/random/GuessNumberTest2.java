package com.study.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏案例
 * 需求: 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 11:15
 */
public class GuessNumberTest2 {
    public static void main(String[] args) {
        // 1、生成一个随机数
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1-100之间的数字");
            int answer = scanner.nextInt();
            if (answer > number) {
                System.out.println("猜大了");
            } else if (answer < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}