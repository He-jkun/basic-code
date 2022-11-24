package Test;

import java.util.Scanner;

public class StrringBuilderTest1 {
    public static void main(String[] args) {
        //需求：键盘接受一个字符串，程序判断出该字符串是否对称字符串，并在控制台打印是或不是

        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();

        //比较
        if (str.equals(result)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        StringBuilder sb = new StringBuilder(sc.next());
        if (sb.reverse() == sb){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }*/
    }
}
