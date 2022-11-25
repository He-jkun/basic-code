package Test10;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //定义两个变量用于记录字母、数字数量
        int letterCount = 0;
        int numberCount = 0;
        //将字符串转为字符数组
        char[] arr = str.toCharArray();
        //遍历字符数组，判断字符数组内字母、数字的个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z') {
                letterCount++;
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                numberCount++;
            }
        }
        //打印
        String result = new String(arr);
        System.out.println(result + "中，字母有：" + letterCount + "个，数字有：" + numberCount + "个");
    }
}
