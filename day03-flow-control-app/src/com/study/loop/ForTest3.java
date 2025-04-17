package com.study.loop;

/**
 * for循环案例-2
 * 需求: 输出1~10之间的奇数和
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 09:53
 */
public class ForTest3 {
    public static void main(String[] args) {
        // 方式一
        int sum = 0;
        for (int k = 1;k<=10; k+=2){
            sum += k;
        }
        System.out.println(sum);

        // 方式二
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum2 += i;
            }
        }
        System.out.println(sum2);
    }

}