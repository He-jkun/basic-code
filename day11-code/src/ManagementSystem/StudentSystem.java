package ManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        ArrayList<Student> list = new ArrayList<>();
        //Student s = new Student("heima001", "张三", 23, "南京");
        //list.add(s);
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
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }

    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String addStudentId = null;
        while (true) {
            System.out.print("输入要添加的学生id：");
            addStudentId = sc.next();
            if (contains(list, addStudentId)) {
                System.out.println("id:" + addStudentId + "已存在");
                return;
            } else {
                s.setId(addStudentId);
                break;
            }
        }
        System.out.print("请输入要添加的学生姓名：");
        String addStudentName = sc.next();
        s.setName(addStudentName);
        System.out.print("请输入要添加的学生年龄：");
        int addStudentAge = sc.nextInt();
        s.setAge(addStudentAge);
        System.out.print("请输入要添加的学生家庭住址：");
        String addStudentHome = sc.next();
        s.setHome(addStudentHome);
        list.add(s);
        System.out.println("添加成功");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("输入要删除的学生id：");
            String deleteStudentId = sc.next();
            if (contains(list, deleteStudentId)) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(deleteStudentId)) {
                        list.remove(i);
                        System.out.println("id为" + deleteStudentId + "的删除成功");
                        return;
                    }
                }
            } else {
                System.out.println("id:" + deleteStudentId + "不存在，删除失败");
                return;
            }
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("输入要修改的学生id：");
            String updateStudentId = sc.next();
            if (contains(list, updateStudentId)) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(updateStudentId)) {
                        System.out.print("id为：" + updateStudentId + "的学生信息为：");
                        System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge() + " " + list.get(i).getHome());
                        System.out.print("请输入修改后的姓名：");
                        list.get(i).setName(sc.next());
                        System.out.print("请输入修改后的年龄：");
                        list.get(i).setAge(sc.nextInt());
                        System.out.print("请输入修改后的家庭住址：");
                        list.get(i).setHome(sc.next());
                        System.out.println("修改成功");
                        return;
                    }
                }
            } else {
                System.out.println("id：" + updateStudentId + "不存在");
                return;
            }
        }
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id" + "         " + "姓名" + "   " + "年龄" + "   " + "家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "   " + list.get(i).getName() + "   " + list.get(i).getAge() + "    " + list.get(i).getHome());
            }
        }
    }

    //判断id是否存
    public static boolean contains(ArrayList<Student> list, String id) {
        if (list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
