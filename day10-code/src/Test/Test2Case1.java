package Test;

public class Test2Case1 {
    public static void main(String[] args) {
        /*给定两个字符串，A和B
        A的旋转操作就是将A最左边的字符移动到最右边
        例如，若A='abcde'，旋转一次之后的结果就是'bcdea'
        如果在若干次旋转之后，A能变成B，那么返回True，不能则返回false
         */
        String A = "abcde";
        String B = "eabcd";

        System.out.println(check(A, B));
    }

    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    //创建一个方法：旋转字符串
    public static String rotate(String str) {
        //定义一个字符将字符串最左边的字符拿出来存放
        char first = str.charAt(0);
        //将字符串剩余的字符截取出来并储存到一个新的字符串中
        String end = str.substring(1);
        //将第一个字符拼接到截取后的字符串最右边
        return end + first;
    }

}
