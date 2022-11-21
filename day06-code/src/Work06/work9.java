package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:33
 */
public class work9 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int newLength = 5;
    int[] newArr = copyOf(arr,5);
        for (int i = 0; i < newLength; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
