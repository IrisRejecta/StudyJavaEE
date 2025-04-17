package com.study.branch;

/**
 * Switch穿透性应用案例
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/15 09:31
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        // 需求: 用户输入月份可以展示该月份的天数
        // 1、3、5、7、8、10、12月31天
        // 4、6、9、11月30天
        // 2月份28天，闰年29天
        int month = 7;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+"月是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月是30天");
                break;
            case 2:
                System.out.println("非闰年28天,闰年29天");
               break;
            default:
                System.out.println("数据有误！");
                break;
        }
        for(int i = 0; i<3; i++) {
            System.out.println("i="+i);
        }
    }
}