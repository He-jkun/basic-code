package com.itheima.arithmeticoperator.day03;

public class Test5 {
    public static void main(String[] args) {
        int height1 = (150);
        int height2 = (210);
        int height3 = (165);
        int result1 = height1 > height2 ? height1 : height2;
        int result2 = result1 > height3 ? result1 : height3;
        System.out.println(result2);
    }
}
