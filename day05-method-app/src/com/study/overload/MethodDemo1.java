package com.study.overload;

/**
 *
 * 识别方法重载的形式，并理解其调用流程，最后需要知道方法重载的好处
 *
 * @author w1170
 * @version 1.0
 * @since 2025/4/22 14:38
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire(5);
        fire(5, "Place");
    }
    public static void fire() {
        System.out.println("发射一枚武器到默认地点");
    }
    public static void fire(int num) {
        System.out.println("发射" + num + "枚武器到默认地点");
    }
    public static void fire(int num, String place) {
        System.out.println("发射" + num + "枚武器到" + place + "地点");
    }

}