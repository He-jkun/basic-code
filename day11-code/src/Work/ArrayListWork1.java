package Work;

import java.util.ArrayList;

public class ArrayListWork1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        list.add(s1);
        list.add(s2);
        list.add(s1);
        list.add(s1);
        list.add(s3);
        list.add(s2);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + ",");
            }
        }
    }
}
