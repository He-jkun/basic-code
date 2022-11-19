package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int price = 600;
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入用户实际付款金额");
        int pay = sc.nextInt();
        if (pay >= price){
            System.out.println("支付成功");
        } else {
            System.out.println("支付失败");
        }

    }
}
