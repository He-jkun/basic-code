package work;

import java.util.Scanner;

public class Work8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;
        int count =0;
        for (int i = min; i <= max; i++){
            if (i % 3 ==0 && i % 5 ==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
