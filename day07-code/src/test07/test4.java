package test07;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 19:16
 */
public class test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
