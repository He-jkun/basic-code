package Demo;

/**
 * @author Jkun
 * @description TODO
 * @date 2022-11-18 19:17
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] year = {11,12,13,14,15};
        String[] name = {"张三","李四","王五"};
        double[] height = {180.1,178.5,177.7,180.1};

        //获取数组里面的元素
        int num = year[1];
        System.out.println(num);

        //把数据存储到数组中
        name[0] = "李娜";
        System.out.println(name[0]);
    }
}
