package Demo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1 使用直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2 使用new的方式来获取一个字符串对象
        //2.1 空参构造：可以获得一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //2.2 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        char[] chs = {'1', '2', 'a', 'b', 'c'};
        String s3 = new String(chs);
        System.out.println(s3);//12abc

        //2.3 传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);//abcd
    }
}
