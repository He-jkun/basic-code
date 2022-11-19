package Test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入键盘号");
        int number = sc.nextInt();
        switch (number){
            case 1-> System.out.println("机票查询");
            case 2-> System.out.println("机票预定");
            case 3-> System.out.println("机票改签");
            case 4-> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
