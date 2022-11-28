package Demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //范型
        //ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");

        //删除元素
        boolean result = list.remove("e");

        //修改元素
        list.set(0, "eee");

        //查询元素
        list.get(1);

        list.get(list.size() - 1);
        System.out.println(result);

    }
}
