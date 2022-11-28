package Test10;

public class Test6 {
    public static void main(String[] args) {
        //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
        String str = "1234321";
        if (isSym(str)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isSym(String str) {
        if (str == null) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder(str);
            String temp = sb.reverse().toString();
            return str.equals(temp);
        }





        /*char[] arr = str.toCharArray();
        char[] temp = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                return false;
            }
        }
        return true;*/
    }
}
