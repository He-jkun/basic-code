package Test10;

public class Test7 {
    public static void main(String[] args) {
        String id = "030103199612070317";
        System.out.println(checkId(id));
    }

    public static boolean checkId(String str) {
        if (str.length() != 18) {
            System.out.println("长度不符合");
            return false;
        }

        if (str.startsWith("0")) {
            System.out.println("第一个字符为0");
            return false;
        }

        /*char[] id = new char[18];
        if (id[0] == '0') {
            System.out.println("第一个字符为0");
            return false;
        }*/

        for (int i = 0; i <= str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("前17位数有异常");
                return false;
            }
        }
        char c = str.charAt(17);
        if (c < '0' || c > '9' && c != 'X') {
            System.out.println("18位数有异常");
            return false;
        }
        return true;
    }
}
