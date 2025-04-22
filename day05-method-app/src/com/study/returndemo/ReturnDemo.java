package com.study.returndemo;

/**
 * return 关键字的使用： 立即跳出并结束当前方法的执行
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 14:52
 */
public class ReturnDemo {
    public static void main(String[] args) {
        chu(10,3);
    }
    public static void chu(int a, int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a/b);
    }
}