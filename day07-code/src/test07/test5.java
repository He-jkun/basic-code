package test07;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int[] fraction = getScores();
        int max = getMax(fraction);
        int min = getMin(fraction);
        int sum = getSum(fraction);
        int average = (sum - min -max) / (fraction.length - 2);
        System.out.println("最高分：" + max + "分");
        System.out.println("最低分：" + min + "分");
        System.out.println("总得分：" + sum + "分");
        System.out.println("选手的平均得分为：" + average + "分");
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入评委数量：");
        int quantity = sc.nextInt();
        int[] scores = new int[quantity];
        for (int i = 0; i < scores.length; ) {
            System.out.println("输入评委" + (i + 1) + "的分数（0-100）");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                scores[i] = num;
                i++;
            } else {
                System.out.print("输入分数错误，请重新");
            }
        }
        return scores;
    }
}
