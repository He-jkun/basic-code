package regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "4h41455482";
        System.out.println(checkQQ(qq));
    }

    public static boolean checkQQ(String qq) {
        int len = qq.length();
        if (!(len >= 6 && len <= 20)) {
            return false;
        }
        char[] chars = qq.toCharArray();
        if (chars[0] == '0') {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
