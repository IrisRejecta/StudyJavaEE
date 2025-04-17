package com.study.variable;

/**
 * 演示Java基本数据类型变量的定义和使用
 * <p>
 * 本类示例展示了如何正确定义和使用Java的8种基本数据类型变量，
 * 包括整型、浮点型、字符型和布尔型等。
 * </p>
 *
 * @author w1170
 * @version 1.0
 * @since 2025-04-13
 */
public class VariableDemo3 {
    public static void main(String[] args) {
        // 1、byte字节型 占用一个字节 -128~127
        byte number = 66;
        System.out.println(number);
        // byte number2 = 128; 报错

        // 2、short短整型 占用两个字节 -32768~32767
        short sh = 31561;
        System.out.println(sh);

        // 3、int整型 默认使用类型 占用四个字节 -2147483648~2147483647
        int in = 1028010;
        System.out.println(in);

        // 4、long长整型 占用8个字节 -9223372036854775808~9223372036854775807
        long lon = 12345678;
        System.out.println(lon);
        // 注意：随便写一个整数字面量默认是int类型，lon2虽然没有超过long的范围，但是超过了int的范围，所以需要显示的指定为long类型
        // 如果希望随便写一个整数字面量当成long类型，需要在字面量后面加一个L/l
        long lon2 = 123456789011111L;
        System.out.println(lon2);

        // 5、float单精度浮点型 占用4个字节
        float fl = 3.14f;
        // 随便写一个浮点数字面量默认是double类型，如果希望随便写一个小数当成float类型，需要在字面量后面加一个F/f
        System.out.println(fl);

        // 6、double双精度浮点型 占用8个字节
        double db = 3.14;
        System.out.println(db);

        // 7、char字符型 占用两个字节
        char ch = 'a';
        System.out.println(ch);

        // 8、boolean布尔型 占用一个字节
        boolean bl1 = true;
        System.out.println(bl1);
        boolean bl2 = false;
        System.out.println(bl2);

        System.out.println("-----------------引用数据类型--------------------");
        // 9、引用数据类型String
        String str = "hello";
        System.out.println(str);
    }

}