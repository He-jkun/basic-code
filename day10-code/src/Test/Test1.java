package Test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        /*需求：键盘录入一个字符串，
        要求1：长度小于等于9
        要求2：只能是数字
        将内容变成罗马数字
        阿拉伯数字和罗马数字对比关系:
        I-1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
         */

        //1 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;

        //2 校验字符串长度
        while (true) {
            System.out.println("输入数字字符串");
            str = sc.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.print("输入的字符串错误，请重新");
            }
        }

        //3 将内容变成罗马数字
        //定义一个数组存储罗马数字  I-1、II-2、III-3、IV-4、V-5、VI-6、VII-7、VIII-8、IX-9
        String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringJoiner result = new StringJoiner(",");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - 48;
            result.add(romanNumerals[num]);
        }
        str = result.toString();
        System.out.println(str);

    }

    //创建方法校验字符串长度是否大于9且不包含除数字以为的字符
    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
