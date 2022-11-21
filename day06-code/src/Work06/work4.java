package Work06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 15:40
 */
public class work4 {
    public static void main(String[] args) {
        double a = -99;
        System.out.println(get(a));
    }
    public static double get(double num){
        double number = 0;
        if (num >= 0){
            number = num;
        } else  {
            number = - num;
        }
        return number;
    }
}
