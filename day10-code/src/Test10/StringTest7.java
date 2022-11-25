package Test10;

import java.util.Scanner;

public class StringTest7 {
    public static void main(String[] args) {
        //需求：手机号屏蔽，屏蔽手机号中间4位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String phoneNUmber = sc.next();
        String start = phoneNUmber.substring(0, 3);
        String end = phoneNUmber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
