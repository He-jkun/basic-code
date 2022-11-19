package Work;

import java.util.Scanner;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-19 22:30
 */
public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字");
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[11];
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num){
                brr[i] = arr[i];
                index = i +1;
            }else {
                brr[i+1] = arr[i];
            }
        }
        brr[index] = num;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
