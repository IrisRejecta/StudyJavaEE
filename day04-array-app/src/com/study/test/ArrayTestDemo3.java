package com.study.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 需求：开发一个幸运小游戏，游戏规则如下：
 * 游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字
 *      未猜中提示：“未命中”，“并继续猜测
 *      猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数据，最终结束本游戏。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 18:59
 */
public class ArrayTestDemo3 {
    public static void main(String[] args) {
        // 1、定义一个动态初始化数组存储5个1-20之间的随机数
        int[] number = new int[5];
        // 2、生成5个1-20之间的随机数并存入到数组中去
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(20)+1;
        }
        // 3、使用一个死循环让用户进行猜测1
        Scanner scanner = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请输入一个1-20之间的数字");
            int guess = scanner.nextInt();
            // 3、遍历数组，判断用户输入的数字是否在数组中
            for (int i = 0; i < number.length; i++) {
                if (guess == number[i]){
                    System.out.println("恭喜你猜中了，该数字第一次出现的位置是："+i);
                    System.out.println("该数字是："+number[i]);
                    break OUT;
                }
            }
            System.out.println("未命中，请继续猜测");
        }
        // 5、输出全部5个数据
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ "\t");
        }
    }

}