package com.itheima.arithmeticoperator.day03;

public class ArithmeticoperatorrDemo8 {
    public static void main(String[] args) {
        //并且
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);


        //或者
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);System.out.println("---------");


        System.out.println("---------");

        //逻辑异或
        System.out.println(true ^ true);
        System.out.println(false  ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("---------");

        //逻辑取反
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("---------");

        //短路与
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println("---------");

        //短路或
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);

        System.out.println("---------");

        //短路效果
        int a = 10;
        int b = 10;
        boolean result1 = ++a < 5 && ++b<5;
        System.out.println(result1);
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = 10;
        boolean result2 = ++c > 5 || ++d > 10;
        System.out.println(result2);
        System.out.println(c);
        System.out.println(d);
    }
}
