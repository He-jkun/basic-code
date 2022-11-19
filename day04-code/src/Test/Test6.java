package Test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();
        if (score >= 95 && score <=100){
            System.out.println("小明获得自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("小明可以取游乐场玩一天");
        } else if (score >= 80 && score <=89) {
            System.out.println("小明获得变形金刚一个");
        } else if (score >= 0 && score <= 80){
            System.out.println("小明获得一顿揍");
        } else {
            System.out.println("分数超出范围请重新运行");
        }
    }
}
