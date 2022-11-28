package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest4 {
    public static void main(String[] args) {
        //定义一个集合，键盘录入学生对象，并进行遍历
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //创建学生对象
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            //获取学生姓名
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            //获取学生年龄
            int age = sc.nextInt();
            //把姓名和年龄赋值给学生对象
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合中
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
