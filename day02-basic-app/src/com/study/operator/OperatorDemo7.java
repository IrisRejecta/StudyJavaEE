package com.study.operator;

/**
 * 学习使用逻辑运算符
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 07:34
 */
public class OperatorDemo7 {
    public static void main(String[] args) {
        double size = 10.5;
        double price = 110.0;

        // 逻辑与，同时满足两边，尺寸大于10，价格大于100
        if (size > 10 && price > 100) {
            System.out.println("有货，可以买");
        } else {
            System.out.println("没货了");
        }

        // 逻辑或，满足其中一个即可，尺寸大于10或者价格低于100才购买
        if (size > 10 || price < 100) {
            System.out.println("便宜！买！");
        } else {
            System.out.println("算了，没有性价比");
        }

        // 逻辑非，取反
        System.out.println(!true);
        System.out.println(!false);

        // 逻辑异或，必须两个结果不同
        System.out.println("同结果逻辑异或"+(true ^ true));
        System.out.println("不同结果逻辑异或"+(true ^ false));

        System.out.println("-------------------逻辑与 & 短路与 && 逻辑或 | 短路或 || 的区别---------------------");
        System.out.println("----------与---------");
        int a = 10;
        int b = 20;
        System.out.println(a > 100 &&  ++b > 20);
        // 短路与，前面为false，后面不运行，因此b的值不会改变
        System.out.println(b);
        System.out.println("-------------------");
        System.out.println(a> 100 &  ++b > 20);
        // 逻辑与，无论如何，后面也会运行，因此b的值会改变
        System.out.println(b);
        System.out.println("----------或---------");
        int i = 10;
        int j = 20;
        System.out.println(i > 9 ||  ++j > 20);
        // 短路或，前面为true，后面不运行，因此j的值不会改变
        System.out.println(j);
        System.out.println("-------------------");
        System.out.println(i> 9 |  ++j > 20);
        // 逻辑或，无论如何，后面也会运行，因此j的值会改变
        System.out.println(j);
    }

}