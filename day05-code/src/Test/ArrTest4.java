package Test;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 19:44
 */
public class ArrTest4 {
    public static void main(String[] args) {
       int[] arr = {20,55,34,68,10};
       int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
