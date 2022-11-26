package StudentSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        System.out.println("欢迎来到学生管理系统");
        while (true) {
            System.out.println("选择操作 1登录 2注册 3忘记密码");
            String choice = sc.next();
            switch (choice) {
                case "1" -> System.out.println("登录");
                case "2" -> register(list);
                case "3" -> System.out.println("忘记密码");
                default -> System.out.println("没有该选项");
            }
        }
    }

    //方法：登录
    public static void signIn() {
        System.out.println("输入用户名");
    }

    //方法：注册
    public static void register(ArrayList<User> list) {
        User u = new User();

        Scanner sc = new Scanner(System.in);

        //1 校验用户名规则
        System.out.println("输入用户名");
        String name = sc.next();
        //判断用户名是否已存在
        int index = getIndex(list, name);
        if (index >= 0) {
            System.out.print("该用户名已存在，请重新");
            return;
        }
        //判断用户名长度是否在3～15之间
        if (name.length() < 3 || name.length() > 15) {
            System.out.print("用户名长度错误，请重新");
            return;
        }
        //判断用户名是否只包含数字或字母，且不是纯数字
        if (checkName(name)) {
            u.setName(name);
        } else {
            System.out.print("用户名格式错误，请重新");
            return;
        }

        //2 校验密码规则
        System.out.println("输入密码");
        String password1 = sc.next();
        System.out.println("确认密码");
        String password2 = sc.next();
        if (password1.equals(password2)) {

        } else {
            System.out.println("两次密码不一致");
        }

        //3 校验身份证
        System.out.println("输入身份证号码");
        String id = sc.next();
        //校验长度
        if (id.length() != 18) {
            System.out.println("身份证号码长度错误");
        }
        //校验第一位是否为0
        if (id.charAt(0) == '0') {
            System.out.println("身份证号码第一位错误");
        }
        //校验前17位是否位数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("身份证号码第" + (i + 1) + "不能为数字");
            }
        }
        //校验最后一位数是否为数字或X/x
        if (id.charAt(17) < '0' || id.charAt(17) > '9' && id.charAt(17) != 'x' && id.charAt(17) != 'X') {
            System.out.println("身份证号码最后一位错误");
        }
    }

    //方法：忘记密码
    public static void forgotPassword() {

    }

    //方法：查找用户名所在元素的索引
    public static int getIndex(ArrayList<User> list, String name) {
        if (list.size() == 0) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //判断字符串是否只包含字母或数字，且不是纯数字
    public static boolean checkName(String name) {
        int letterNum = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    letterNum++;
                }
                if (letterNum <= 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
