package Test;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 16:17
 */
public class test2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数，计算并返回x的平方根。
        结果只保留整数部分，小数部分将被舍去。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数");
        int x = sc.nextInt();
        for (int i = 1;i <= x; i++){
            if (i * i == x ){
                System.out.println(i + "就是" + x + "的平方根");
                break;
            } else if (i * i > x) {
                System.out.println(i - 1 + "就是" + x + "平方根的整数部分");
                break;
            }
        }
    }
}
