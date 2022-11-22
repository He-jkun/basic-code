package Work06;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 15:46
 */
public class work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        System.out.println(num + "是" + getQuantity(num) + "位数字");
    }

    public static int getQuantity(int num) {
        int a = 1;
        while (num / 10 != 0) {
            num = num / 10;
            a++;
        }
        return a;
    }
}
