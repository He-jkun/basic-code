package Test06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 13:33
 */
public class test8 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
