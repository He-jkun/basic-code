package Test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品总价");
        int price = sc.nextInt();
        System.out.println("请输入会员级别");
        int grade = sc.nextInt();
        if (grade >= 1 && grade <= 3) {
            if (grade == 1){
                System.out.println("折后价格为：" + (price * 0.9) );
            } else if (grade == 2) {
                System.out.println("折后价格为：" + (price * 0.8) );
            } else if (grade == 3){
                System.out.println("折后价格为：" + (price * 0.7) );
            }
        } else {
            System.out.println("非会员不打折，价格为：" + (price) );
        }
    }
}
