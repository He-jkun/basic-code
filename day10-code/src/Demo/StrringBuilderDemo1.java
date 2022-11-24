package Demo;

public class StrringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("abcd");

        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);*/
        //反转
        sb.reverse();

        sb.length();
        System.out.println(sb.length());
    }
}
