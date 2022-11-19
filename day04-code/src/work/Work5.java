package work;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资");
        int money = sc.nextInt();//税前工资
        double before = money - (money * 0.1) - 5000;//应纳税部分工资
        double shui = 0;
        if (before > 0 && before <= 3000){
            shui = before * 0.03;
        } else if (before > 3000 && before <= 12000) {
            shui = 3000 * 0.03 + (before - 3000) * 0.1;
        } else if (before >12000 && before <= 25000) {
            shui = 3000 * 0.03 + 9000 * 0.1 +(before - 12000) * 0.2;
        } else if (before > 25000 && before <= 35000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 +(before - 25000) * 0.25;
        } else if (before > 35000 && before <= 55000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (before - 35000) * 0.3;
        } else if (before > 55000 && before <= 80000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + (before - 55000) * 0.35;
        }else if (before > 80000) {
            shui = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (before - 80000) * 0.45;
        }
        double after = money - (money * 0.1) - shui;
        System.out.println("个人所得税为：" + shui);
        System.out.println("税后工资为：" + after);
    }
}
