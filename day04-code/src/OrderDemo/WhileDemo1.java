package OrderDemo;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打印的数量");
        int b = sc.nextInt();
        int i = 1;
        while (i <= b){
            System.out.println(i);
            i++;
        }
    }
}
