package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:19
 */
public class work8 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int value = 10;
    int[] arr2 = fill(arr,2,5,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] fill(int[] arr, int fromIndex, int toIndex, int value){
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
