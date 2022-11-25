package Test10;

import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        /*需求：定义一个方法，实现字符串反转
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如：键盘录入abc，输出结果cba
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String s = reversalString(str);
        System.out.println(s);
    }

    public static String reversalString(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            s = s + c;
        }
        return s;
    }
}
