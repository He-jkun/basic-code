package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 15:05
 */
public class work2 {
    public static void main(String[] args) {
        System.out.println(getMax(23,56,10));
    }
    public static int getMax(int a, int b, int c){
        int temp = b > a ? b : a;
        int max = temp > c ? temp : c;
        return max;
    }
}
