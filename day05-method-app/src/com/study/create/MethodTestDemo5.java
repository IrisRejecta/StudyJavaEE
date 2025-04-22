package com.study.create;

/**
 * 判断证书是奇数还是偶数
 * 需求: 输入一个整数，判断该整数是奇数还是偶数,使用方法完成
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 17:33
 */
public class MethodTestDemo5 {
    public static void main(String[] args) {
        String res = isOdd(1);
        System.out.println(res);
    }
    public static String isOdd(int number) {
        if (number % 2 == 0) {
            return number+"是偶数";
        } else {
            return  number+"是奇数";
        }
    }
}