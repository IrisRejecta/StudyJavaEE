package com.study.random;

import java.util.Random;
/**
 * 随机数案例
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 11:04
 */
public class RandomTest1 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            System.out.println("随机数生成了:"+number);
        }
    }
}