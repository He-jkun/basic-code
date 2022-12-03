package a01mathtest1;

public class Mathtest1 {
    public static void main(String[] args) {
        //需求：统计一共有多少个水仙花数
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            //int bai = i / 100 % 10;
            //int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
