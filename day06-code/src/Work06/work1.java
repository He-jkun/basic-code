package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 14:56
 */
public class work1 {
    public static void main(String[] args) {
        System.out.println(getMin(12.2,30));
    }
    /*public static double getMin(double num1, double num2){
        if (num1 > num2){
            return num2;
        }else {
            return num1;
        }
    }*/
    public static double getMin(double num1, double num2){
        double min = num1 < num2 ? num1 : num2;
        return min;
    }
}
