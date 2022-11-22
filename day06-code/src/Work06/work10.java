package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:49
 */
public class work10 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int[] arr2 = copyOfRange(arr,2,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] arr2 = new int[to - from];
        int a = 0;
        for (int i = from; i < to; i++) {
            arr2[a] = arr[i];
            a++;
        }
        return arr2;
    }
}
