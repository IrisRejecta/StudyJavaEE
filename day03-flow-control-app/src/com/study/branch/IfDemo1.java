package com.study.branch;

import java.util.Scanner;

/**
 * 学会使用分支语句-if条件语句
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 08:42
 */
public class IfDemo1 {
    public static void main(String[] args) {
        // 根据输入的成绩，输出成绩等级
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        // 格式一
        if (score >= 100 || score < 0) {
            System.out.println("成绩不合法");
            return;
        }
        // 格式二、三
        if (score >= 90) {
            System.out.println("成绩等级为A");
        } else if (score >= 80) {
            System.out.println("成绩等级为B");
        } else if (score >= 70) {
            System.out.println("成绩等级为C");
        } else if (score >= 60) {
            System.out.println("成绩等级为D");
        } else {
            System.out.println("成绩等级为E");
        }
    }
}