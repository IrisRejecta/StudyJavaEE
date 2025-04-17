package com.study.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机排名
 * 需求：某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。
 * 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/17 19:19
 */
public class ArrayTestDemo4 {
    public static void main(String[] args) {
        // 1、创建数组，长度为5
        int[] arr = new int[5];
        // 2、遍历数组，依次录入5名员工的工号
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + ( i + 1 ) +"名员工的工号");
            arr[i] = scanner.nextInt();
        }

        // 3、遍历数组，展示出随机的排名顺序
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 当前遍历的元素值为 arr[i]
            //  随机一个索引位置出来
            int index = random.nextInt(arr.length);
            // 先将被替换的元素值暂存起来
            int temp = arr[index];
            // 将当前遍历的元素值替换到随机索引位置
            arr[index] = arr[i];
            // 将暂存的值替换到当前遍历的元素值
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }

}