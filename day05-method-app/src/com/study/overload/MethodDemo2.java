package com.study.overload;

/**
 * 识别方法重载
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 14:48
 */
public class MethodDemo2 {
    // 新方法
    public static void open() {

    }
    // 重载方法
    public static void open(int a) {

    }
    // 重载方法
    static void open(int a, int b) {

    }
    // 重载方法
    static void open(int a, double b) {

    }
    // 重复方法
    // public static void open(int d, double f) {}

    // 新方法
    public static void OPEN() {
    }
}