package Test;

import java.util.ArrayList;

public class ArrayListTest6 {
    public static void main(String[] args) {
        /*main方法中定义一个集合，存入三个用户对象
        用户属性为：id、username、password
        要求：定义一个方法，根据id查找对应的用户信息
        如果存在，返回索引
        如果不存在，返回-1
         */
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("001", "zhangsan", "123");
        User u2 = new User("002", "lisi", "123");
        User u3 = new User("003", "wangwu", "123");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(checkIndex(list, "003"));
    }

    public static int checkIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
