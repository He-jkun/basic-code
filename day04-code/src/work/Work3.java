package work;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额（1000起存）");
        int deposit = sc.nextInt();
        while (deposit < 1000) {
            System.out.println("存款金额不得低于1000，请重新输入金额");
            deposit = sc.nextInt();
            }
        System.out.println("请输入存期（1、2、3、5年）");
        int year = sc.nextInt();
        while (year != 1 && year != 2 && year != 3 && year !=5) {
            System.out.println("存款年限为1、2、3、5年，请重新输入年限");
            year = sc.nextInt();
            }
        switch (year){
            case 1-> System.out.println("本息总额为：" + (deposit + (deposit * 2.25 * 1)));
            case 2-> System.out.println("本息总额为：" + (deposit + (deposit * 2.7 * 2)));
            case 3-> System.out.println("本息总额为：" + (deposit + (deposit* 3.25 * 3)));
            case 5-> System.out.println("本息总额为：" + (deposit + (deposit* 3.6 * 5)));
        }
        }
    }
