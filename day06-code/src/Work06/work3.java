package Work06;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 15:12
 */
public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        method(num1,num2,num3);
    }
    public static void method(int a , int b , int c){
        int temp1 = a > b ? a : b;
        int max = temp1 > c ? temp1 : c;
        int temp2 = a < b ? a : b;
        int min = temp2 < c ? temp2 : c;
        int mid = (a + b + c) - min - max;
        System.out.print(max + " ");
        System.out.print(mid + " ");
        System.out.print(min + " ");
    }
}
