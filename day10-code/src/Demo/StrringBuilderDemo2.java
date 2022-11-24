package Demo;

public class StrringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //添加对象
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");

        System.out.println(sb);

        //再把StrringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
