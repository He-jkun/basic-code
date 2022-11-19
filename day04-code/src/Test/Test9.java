package Test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几");
        String day = sc.nextLine();
        switch (day){
            case "周一":
                System.out.println("跑步");
                break;
            case "周二":
                System.out.println("游泳");
                break;
            case "周三":
                System.out.println("慢走");
                break;
            case "周四":
                System.out.println("动感单车");
                break;
            case "周五":
                System.out.println("拳击");
                break;
            case "周六":
                System.out.println("爬山");
                break;
            case "周日":
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
