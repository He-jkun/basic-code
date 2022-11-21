package Work06;

import java.util.Random;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:54
 */
public class work11 {
    public static void main(String[] args) {
        int[] raffle = {2,588,888,1000,10000};
        int[] temp = new int[raffle.length];
        judge(raffle,temp);
    }
    public static void judge(int[] arr,int[] brr){
        Random r = new Random();
        int count = 0;
        while (count <= 5){
            int ran = r.nextInt(arr.length);
            if (brr[ran] == arr[ran]){
                continue;
            }else {
                brr[ran]  = arr[ran];
                System.out.println(arr[ran] + "元的奖金被抽出");
                count++;
            }
        }
    }

}
