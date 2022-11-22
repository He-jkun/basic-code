package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:14
 */
public class work7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        int value = 9;
        int[] arr2 = fill(arr,9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
