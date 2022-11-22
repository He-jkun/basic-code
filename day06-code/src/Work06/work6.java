package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 16:02
 */
public class work6 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        if (equals(a,b)){
            System.out.println("这两个数组相同");
        }else {
            System.out.println("这两个数组不同");
        }
    }
    public static boolean equals(int[] arr1, int[] arr2){
        boolean result = true;
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]){
                    result = true;
                }else {
                    result = false;
                }
            }
        }else {
            result = false;
        }
        return result;
    }
}
