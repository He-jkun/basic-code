package Test;

import java.util.Scanner;

public class StringTest8 {
    public static void main(String[] args) {
        //需求：通过身份证7-14位查看出生年月日，17位判断男/女
        Scanner sc = new Scanner(System.in);
        String idCard = "";
        while (true) {
            System.out.println("输入身份证");
            idCard = sc.next();
            if (idCard.length() != 18) {
                System.out.print("您输入的身份证有误，请重新");
            } else {
                break;
            }
        }
        String year = idCard.substring(6, 10);//获取出生年
        String month = idCard.substring(10, 12);//获取出生月
        String day = idCard.substring(12, 14);//获取出生日
        char gender = idCard.charAt(16);
        System.out.println("人物信息：");
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
