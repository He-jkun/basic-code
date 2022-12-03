package a02bigIntegerdemo;

import java.math.BigInteger;

public class bigIntegerdemo2 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(9);

        /*System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd2.multiply(bd1));
        System.out.println(bd1.divide(bd2));
        System.out.println(Arrays.toString(bd2.divideAndRemainder(bd1)));
        System.out.println(bd1.equals(bd2));*/
        System.out.println(bd1.pow(3));
        System.out.println(bd1.max(bd2));

    }
}
