package Test;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 16:06
 */
public class test1 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
