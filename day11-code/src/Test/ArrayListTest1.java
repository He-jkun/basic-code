package Test;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //定义一个集合，添加元素，并进行遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
