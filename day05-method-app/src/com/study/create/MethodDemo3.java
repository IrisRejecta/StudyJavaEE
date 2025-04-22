package com.study.create;

/**
 * 学会方法定义的其他形式，并理解其流程
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/21 15:59
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        print();
    }

    /**\
     * 无参数无返回值方法
     */
    public static void print() {
        for (int i = 0; i < 3; i++){
            System.out.println("hello world");
        }
    }
}