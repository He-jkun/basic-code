package Test;

public class Test2Case2 {
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
        //将字符串转为字符数组
        char[] arr = str.toCharArray();
        //将字符数组的第一个字符取出来单独存放
        char first = arr[0];
        //把字符数组字符往前挪一个索引
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //将字符数组第一个字符放在挪位以后的数组的最后一个索引位置
        arr[arr.length - 1] = first;
        //将字符数组赋值给字符串
        String result = new String(arr);
        //返回字符串结果
        return result;
    }

}
