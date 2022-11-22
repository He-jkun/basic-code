package Test06;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-21 12:26
 */
public class test5 {
    public static void main(String[] args) {
        int sum1 = getSum(10,20,30);
        int sum2 = getSum(40,20,20);
        int sum3 = getSum(30,20,20);
        int sum4 = getSum(10,10,20);
        int result = sum1 + sum2 + sum3 + sum4;
        System.out.println(result);
    }

    public static int getSum(int num1, int num2, int num3){
        int result =num1 + num2 + num3;
        return result;
    }
}
