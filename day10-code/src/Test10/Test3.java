package Test10;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：键盘录入任意字符串，打乱里面的内容
        //1 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();
        //2 将字符串存入字符数组
        char[] arr = str.toCharArray();
        //3 打乱数组里面的内容
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(0, arr.length);
            char c = arr[i];
            arr[i] = arr[num];
            arr[num] = c;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
