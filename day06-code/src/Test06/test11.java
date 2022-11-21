package Test06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 14:08
 */
public class test11 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int from = 0;
        int to = 4;
        int[] arr2 = copyOfRange(arr,from,to);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
           int index = 0;
           newArr[index] = arr[i];
           index++;
        }
        return newArr;
    }
}
