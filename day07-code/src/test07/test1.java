package test07;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 17:28
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原机票价格");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入头等舱(0)或经济舱(1)");
        int room = sc.nextInt();
        if (month >= 5 && month <= 10) {
            price = getPrice(price, room, 0.9, 0.85);
        } else {
            price = getPrice(price, room, 0.7, 0.65);
        }
        System.out.println("你的机票价格为：" + price);
    }

    public static int getPrice(int price, int seat, double v0, double v1) {
        if (seat == 0) {
            //头等舱
            price = (int) (price * v0);
        } else if (seat == 1) {
            //经济舱
            price = (int) (price * v1);
        } else {
            System.out.println("你的座位输入有误");
        }
        return price;
    }
}
