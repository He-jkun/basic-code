package work;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数");
//        int a = sc.nextInt();
//        System.out.println("请输入第二个整数");
//        int b = sc.nextInt();
//        System.out.println("请输入第三个整数");
//        int c = sc.nextInt();
//        int result1 = a > b ? a : b;
//        int result2 = result1 > c ? result1 : c;
//        System.out.println(result2);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();
        if (a > b){
            if (a > c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }else {
            if (b > c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }
    }
}
