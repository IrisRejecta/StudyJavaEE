package com.study.branch;

/**
 * 学习Switch分支结构
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 08:55
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        String day = "星期一";
            // 1、day可以是byte、short、int、char、String类型的数据
        switch (day) {
            // 2、case后面只能是常量表达式，不能是变量
            case "星期一":
                System.out.println("埋头苦干，解决BUG");
                // break
            // 3、穿透现象: 此处不写break，会继续执行下一条case
            case "星期二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "星期三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "星期四":
                System.out.println("周四");
                break;
            case "星期五":
                System.out.println("周五");
                break;
            case"星期六":
                System.out.println("周六");
                break;
            case "星期天":
                System.out.println("周天");
                break;
            default:
                System.out.println("数据有误！");
                break;
        }
    }
}