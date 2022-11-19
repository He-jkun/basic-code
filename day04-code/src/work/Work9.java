package work;

public class Work9 {
    public static void main(String[] args) {
        for (int i = 2019; i >= 1940; i--){
            if ((2019 - i) % 12 == 0 ){
                System.out.println(i);
            }
        }
    }
}
