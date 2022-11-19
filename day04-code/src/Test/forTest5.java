package Test;

import java.util.Scanner;

public class forTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        int i = 0;
        int count = 0;
        for (i = number1; i <= number2;i++){
            if (i % 3 == 0 & i % 5 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
