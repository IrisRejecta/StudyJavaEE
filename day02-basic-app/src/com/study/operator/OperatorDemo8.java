package com.study.operator;

/**
 * 学习使用三元运算符
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 07:58
 */
public class OperatorDemo8 {
    public static void main(String[] args) {

        double score = 80;
        String rs = score >= 60 ? "及格" : "不及格";
        System.out.println(rs);

        String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "E";
        System.out.println(grade);

        // 需求:从两个整数中找出最大值
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);
    }

}