package work;

import java.util.Scanner;

public class Work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        /*if (num1 > num2){
            int i = num1 - num2;
            int sum = 0;
            while (i >= 0 ){
                sum = sum +num2;
                num2 = num2 + 1;
               i--;
            }
            System.out.println(sum);*/
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int sum = 0;
        for (int i =min; i <= max ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
