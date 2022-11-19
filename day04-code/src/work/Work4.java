package work;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类型（0表示普通顾客，1表示会员）");
        int type = sc.nextInt();
        while (type != 1 && type != 0){
            System.out.println("顾客类型输入错误，请重新输入（0表示普通顾客，1表示会员）");
            type = sc.nextInt();
        }
        System.out.println("请输入购物金额");
        int price = sc.nextInt();
        if (type == 0){
            if (price <100){
                System.out.println("应付金额为：" + price);
            }else {
                System.out.println("应付金额为：" + (price * 0.9));
            }
        } else if (type == 1) {
            if (price < 200){
                System.out.println("应付金额为：" + (price * 0.8));
            }else {
                System.out.println("应付金额为：" + (price * 0.75));
            }
        }
        }
        }
