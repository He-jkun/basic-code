package test07;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 18:09
 */
public class teset2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "是质数");
                count++;
            }
        }
    }
}
