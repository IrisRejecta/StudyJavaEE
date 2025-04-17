package com.study.operator;

/**
 * +符号做连接符
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 05:14
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("abc" + "a");
        System.out.println("abc"+a);
        System.out.println(5+a);
        System.out.println("abc"+ 5 + 'a');
        System.out.println(15+"abc"+15);
        // a的ASCII码是97 因此可以计算
        System.out.println(a+'a');
        System.out.println(a+" "+'a');
        System.out.println(a+'a'+"Hello");
        System.out.println("Hello"+a+'a');
        System.out.println("Hello"+(a+'a')+"World");
    }
}