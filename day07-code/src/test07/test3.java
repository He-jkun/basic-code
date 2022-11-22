package test07;

import java.util.Random;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 18:52
 */
public class test3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //添加小写
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
       int num = r.nextInt(10);
       result = result + num;
        System.out.print(result);
    }

}
