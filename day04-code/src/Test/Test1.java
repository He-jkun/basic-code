package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入小明的名次");
        Scanner sc = new Scanner(System.in);
        int ranking = sc.nextInt();
        if (ranking == 1){
            System.out.println("小红成为了小明的女朋友");
        }

    }
}
