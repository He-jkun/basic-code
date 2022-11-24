package Demo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("1").add("2").add("3");
        String s = sj.toString();
        int l = sj.length();
        System.out.println(s);
    }
}
