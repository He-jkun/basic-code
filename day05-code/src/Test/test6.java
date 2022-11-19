package Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 17:14
 */
public class test6 {
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(1,100);
        System.out.println(number1);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            System.out.println("请输入你猜的数字");
            int number2 = sc.nextInt();
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }
                if (number2 > number1) {
                    System.out.println("猜大了");
                } else if (number2 < number1) {
                    System.out.println("猜小了");
                } else {
                    System.out.println("猜中了");
                    break;
                }
        }

    }
}
