package com.study.loop;

/**
 * While循环案例
 * 需求:世界最高山峰是珠穆朗玛峰(8848.86米=8848860毫米)，假如我有一张足够大的纸，
 * 它的厚度是0.1毫米。请问，折叠多少次，可以折成珠穆朗玛峰的高度。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 10:16
 */
public class WhileDemo6 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 88488600) {
            i*=2;
            count++;
        }
        System.out.println("折叠了"+count+"次，可以折成珠穆朗玛峰的高度");
        System.out.println("纸张厚度为"+i+"毫米");
    }
}