package com.study.loop;

/**
 * for循环案例-3
 * 需求:在控制台输出所有的"水仙花数"
 * 水仙花数: 1、是一个三位数 2、水仙花数的个位、十位、百位的数字立方和等于原数
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 09:57
 */
public class ForTest4 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("水仙花个数是:"+count);
    }

}