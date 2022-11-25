package Test;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        //定义一个集合，添加一些学生对象，并进行遍历
        ArrayList<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("马兴杰", 24);
        Student s2 = new Student("和靖昆", 26);
        Student s3 = new Student("李娜", 26);

        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
