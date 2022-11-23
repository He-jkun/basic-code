package Demo;

public class StringDemo2 {
    public static void main(String[] args) {
        //创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        //==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);//false

        //boolean equals比较
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //boolean equalsIgnoreCase比较（忽略大小写比较）
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);

    }
}
