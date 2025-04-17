package com.study.loop;

/**
 * for循环案例-1
 * 需求: 求1~5之间的数据和，并把求和结果输出打印
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 09:51
 */
public class ForTest2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}