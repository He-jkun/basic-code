package Test;

import java.util.Random;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 10:42
 */
public class ArrTest6 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
