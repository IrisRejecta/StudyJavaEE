package com.study.loop;

import java.util.Scanner;

/**
 * 死循环案例
 * 需求: 需求：系统密码是520，请用户不断的输入密码验证，验证不对输出密码错误，验证成功输出欢迎进入系统，并停止程序。
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 10:46
 */
public class DeathLoopDemo8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入密码：");
            int password = scanner.nextInt();
            int okPassword = 520;
            if (password == okPassword){
                System.out.println("欢迎进入系统");
                break;
            }else {
                System.out.println("密码错误,请重新输入");
            }
        }
        scanner.close();

    }

}