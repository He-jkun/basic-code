package Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入电影票号");
        int seatNumber = sc.nextInt();
        if (seatNumber >= 1 && seatNumber <= 100) {
            if (seatNumber % 2 == 1) {
                System.out.println("请坐左侧");
            } else {
                System.out.println("请坐右侧");
            }
        } else {
            System.out.println("无效票号");
        }
    }
}
