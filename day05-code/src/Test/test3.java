package Test;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 16:30
 */
public class test3 {
    public static void main(String[] args) {
        /*需求：键盘录入一个正整数x，判断该整数是否为一个质数。*/
        //质数：
        //如果一个数只能被1和本身整除，那么这个数就是质数。
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        //定义一个布尔值
        boolean flag = true;
        //2.判断
        //写一个循环，从2开始，到num-1，用num除以这个范围里的所有数，如果都无法整除，该数即为质数
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                //循环如果进入，说明该数不是一个质数，flag改变为false
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(num + "是一个质数");
        }else {
            System.out.println(num + "不是一个质数");
        }
    }
}
