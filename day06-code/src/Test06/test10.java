package Test06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 13:52
 */
public class test10 {
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,10,23,56};
        double num1 = 5;
        System.out.println(contains(arr,num1));
    }

    public static boolean contains(int[] arr, double number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number ){
            return true;
            }
        }
        return false;
    }
}
