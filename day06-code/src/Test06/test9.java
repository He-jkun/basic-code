package Test06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 13:42
 */
public class test9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 9};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
