package Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("身上的钱数");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money >= 100){
            System.out.println("网红餐厅");
        } else {
            System.out.println("沙县小吃");
        }

    }
}
