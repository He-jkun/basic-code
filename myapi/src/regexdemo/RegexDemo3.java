package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这个两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }

    }

    private static void method1(String str) {

        //获取文本匹配器的对象
        //m：文本匹配器对象
        //str：大字符串（目标文本）
        //p：规则
        //m要在str中找符合p规则的小字符串


    }
}
