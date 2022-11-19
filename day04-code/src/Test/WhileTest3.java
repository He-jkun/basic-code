package Test;

public class WhileTest3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        int c = 0;
        int d = 0;
        while (a >= b){
          a = a - b;
          c++;
        }
        System.out.println("商：" + c);
        System.out.println("余数：" + a);
    }
}
