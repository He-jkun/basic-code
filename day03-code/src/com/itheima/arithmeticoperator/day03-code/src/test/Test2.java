package com.itheima.arithmeticoperator.day03;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入自己的衣服时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入对方的衣服时髦度");
        int girlFashion = sc.nextInt();

        System.out.println(myFashion > girlFashion);
    }
}
