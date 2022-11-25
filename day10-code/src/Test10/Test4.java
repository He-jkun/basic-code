package Test10;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*生成验证码
        可以是小写字母，也可以是大写字母，还可以是数字
        规则：长度为5，内容中是四位字母，1位数字
        其中数字只有1位，但是可以出现在任意位置
         */

        //定义一个字符数组，存放a～z，A～Z
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串存验证码
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(chs.length);
            code = code + chs[num];
        }
        int number = r.nextInt(10);
        code = code + number;

        char[] arr = code.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            char c = arr[i];
            arr[i] = arr[num];
            arr[num] = c;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
