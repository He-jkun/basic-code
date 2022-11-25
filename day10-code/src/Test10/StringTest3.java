package Test10;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字母字符出现的次数（不考虑其它字符）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigChar = 0;//统计大写字母个数
        int smallChar = 0;//统计小写字母个数
        int numberChar = 0;//统计数字个数

        //遍历字符串，通过ASCII码表判断
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c < '9') {
                numberChar++;
            } else if (c >= 'A' && c <= 'Z') {
                bigChar++;
            } else if (c >= 'a' && c <= 'z') {
                smallChar++;
            } else {
            }
        }
        System.out.println("字符串中大写字母有" + bigChar + "个" + "，小写字母有" + smallChar + "个" + "，数字有" + numberChar + "个。");
    }
}
