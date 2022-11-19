package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticoperatorrDemo9 {
    public static void main(String[] args) {
       //需求：使用三元运算符，获取两个数的较大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        System.out.println(number1 > number2 ? number1 : number2);
    }
}
