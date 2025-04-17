package com.study.loop;

/**
 * 学习循环跳转关键字：break，continue
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 10:57
 */
public class BreakAndContinueDemo9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("外部循环第" + i + "次,内部循环第" + j+"次");
            }
        }

        System.out.println("-------------------");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    System.out.println("跳过内部循环"+j);
                    continue;
                }
                System.out.println("外部循环第" + i + "次,内部循环第" + j+"次");

            }
        }
    }
}