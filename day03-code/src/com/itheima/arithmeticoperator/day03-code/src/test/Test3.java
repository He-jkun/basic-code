package com.itheima.arithmeticoperator.day03;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        boolean result1 = number1 == 6 || number2 == 6 || (number2 + number1) % 6 == 0;
        System.out.println(result1);
    }
}
