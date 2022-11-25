package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.print("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    //添加学生
    public static ArrayList<Student> addStudent(ArrayList<Student> students, String choose) {
        System.out.println("添加学生");
    }

    //删除学生
    public static void deleteStudent() {
        System.out.println("删除学生");
    }

    //修改学生
    public static void updateStudent() {
        System.out.println("修改学生");
    }

    //查询学生
    public static void queryStudent() {
        System.out.println("查询学生");
    }
}
