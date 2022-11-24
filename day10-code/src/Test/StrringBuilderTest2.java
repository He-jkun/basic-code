package Test;

public class StrringBuilderTest2 {
    public static void main(String[] args) {
        //需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
        int[] arr = {1, 2, 3};
        String result = arrToString(arr);
        System.out.println(result);
    }

    //定一个方法
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
