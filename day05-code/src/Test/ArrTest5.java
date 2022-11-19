package Test;

import java.util.Random;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 19:44
 */
public class ArrTest5 {
    public static void main(String[] args) {
        //1 定义数组
        int[] arr = new int[10];
        //2 把随机数存入数组
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            //获取1个1-100的随机数
            int number = r.nextInt(1,100);
            //将当前随机数存入数组
            arr[i] = number;
        }
        //3 遍历数组，求出所有数据的和
        //定义一个记录数组之和的变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("所有随机数的和为：" + sum);
        //5.定义一个变量记录平均值=和/元素量
        int average = sum / arr.length;
        System.out.println("所有随机数的平均数为：" + average);
        //6.遍历数组，判断
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //小于平均数，自增一次
            //大于平均数，不动
            if (arr[i] < average){
                count++;
            }
        }
        System.out.println("小于平均值的随机数有" + count + "个");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
