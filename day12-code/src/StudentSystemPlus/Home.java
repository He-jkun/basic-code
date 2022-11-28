package StudentSystemPlus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        User u = new User("hjk", "123456", "530103199612070317", "13759131461");
        list.add(u);
        System.out.println("欢迎来到学生管理系统");
        while (true) {
            System.out.println("选择操作 1登录 2注册 3忘记密码 4退出");
            String choice = sc.next();
            switch (choice) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("感谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("没有该选项");
            }
        }
    }

    //方法：登录
    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = sc.next();
        int index = getIndex(list, name);
        if (index < 0) {
            System.out.println("用户名未注册，请先注册");
            return;
        }
        System.out.println("输入密码");
        String password = sc.next();
        while (true) {
            String code = getVerificationCode();
            System.out.println("输入验证码（" + code + "）:");
            String verificationCode = sc.next();
            if (verificationCode.equalsIgnoreCase(code)) {
                break;
            } else {
                System.out.print("验证码错误，请重新");
            }
        }
        //判断用户名和密码是否正确
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                if (checkNamePassword(list, index, password)) {
                    System.out.println("登录成功");
                    StudentSystem ss = new StudentSystem();
                    ss.startStudentSystem();
                    break;
                } else {
                    System.out.println("用户名或密码错误，请重新输入密码(还剩" + (3 - i) + "次机会)");
                    password = sc.next();
                }
            } else {
                System.out.println("登录失败");
                return;
            }
        }
    }

    //方法：注册
    public static void register(ArrayList<User> list) {
        User u = new User();

        Scanner sc = new Scanner(System.in);

        //1 录入用户名
        while (true) {
            System.out.println("输入用户名");
            String name = sc.next();
            //检查用户名格式是否正确
            if (checkName(name)) {
                //格式正确，继续判断用户名是否已存在
                int index = getIndex(list, name);
                if (index >= 0) {
                    System.out.print("该用户名已存在，请重新");
                } else {
                    u.setName(name);
                    break;
                }
            }
        }

        //2 录入密码
        while (true) {
            System.out.println("设置密码");
            String password1 = sc.next();
            System.out.println("再次输入密码确认");
            String password2 = sc.next();
            // 校验两次密码是否一致
            if (password1.equals(password2)) {
                u.setPassword(password1);
                break;
            } else {
                System.out.print("两次密码不一致,请重新");
            }
        }

        //3 录入身份证
        while (true) {
            System.out.println("输入身份证号码");
            String id = sc.next();
            //验证身份证格式
            if (checkId(id)) {
                u.setId(id);
                break;
            }
        }

        //4 录入手机号
        while (true) {
            System.out.println("输入手机号");
            String phoneNumber = sc.next();
            //验证手机号格式
            if (checkPhoneNumber(phoneNumber)) {
                u.setPhoneNumber(phoneNumber);
                break;
            }
        }
        list.add(u);
        System.out.println("注册成功");
    }

    //方法：忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = sc.next();
        int index = getIndex(list, name);
        if (index < 0) {
            System.out.println("未注册");
            return;
        }
        System.out.println("输入身份证号");
        String id = sc.next();
        System.out.println("输入手机号");
        String phoneNumber = sc.next();

        //判断手机号码和身份证是否一致
        User u = new User(null, null, id, phoneNumber);
        boolean flag = checkIdPhoneNumber(list, index, u);
        if (flag) {
            System.out.println("请输入修改后的密码");
            String password = sc.next();
            list.get(index).setPassword(password);
            System.out.println("密码修改成功");
        } else {
            System.out.println("账号信息不匹配，修改失败");
        }
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

    //方法：检查用户名格式
    public static boolean checkName(String name) {
        //长度是否在3～15之间
        int len = name.length();
        if (len < 3 || len > 15) {
            System.out.print("用户名长度错误，请重新");
            return false;
        }
        //是否只包含字母或数字
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                System.out.print("用户名只能是数字或字母，请重新");
                return false;
            }
        }
        //不是纯数字
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
            System.out.print("用户名不能是纯数字，请重新");
            return false;
        }
        return count > 0;
    }

    //方法：检查身份证格式
    public static boolean checkId(String id) {
        //校验长度
        if (id.length() != 18) {
            System.out.print("身份证号码长度错误，请重新");
            return false;
        }

        //校验第一位是否为0
        if (id.charAt(0) == '0') {
            System.out.print("身份证号码第一位错误，请重新");
            return false;
        }

        //校验前17位是否位数字
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (c < '0' || c > '9') {
                System.out.print("身份证号码前17位必须为数字，请重新");
                return false;
            }
        }

        //校验最后一位数是否为数字或X/x
        char endChar = id.charAt(id.length() - 1);
        if ((endChar < '0' || endChar > '9') && (endChar != 'x' && endChar != 'X')) {
            System.out.print("身份证号码最后一位错误，请重新");
            return false;
        }
        return true;
    }

    //方法：检查手机号格式
    public static boolean checkPhoneNumber(String phoneNumber) {
        //校验手机号长度是否为11位
        if (phoneNumber.length() != 11) {
            System.out.print("手机号必须为11位，请重新");
            return false;
        }
        //校验手机号第一位是否不为0
        if (phoneNumber.charAt(0) == '0') {
            System.out.print("手机号第一位不能为0，请重新");
            return false;
        }
        //校验录入的手机是否都为数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                System.out.print("手机号必须都为数字，请重新");
                return false;
            }
        }
        return true;
    }

    //方法：生成验证码
    public static String getVerificationCode() {
        //1 创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //2 将随机大小写字母添加到容器
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        //3 随机生成数字，添加到容器
        int number = r.nextInt(10);
        sb.append(number);
        //4 修改容器中字符顺序
        //先把字符串修改为字符数组，然后再创建一个新的字符
        char[] arr = sb.toString().toCharArray();
        //生成一个随机索引
        int randomIndex = r.nextInt(arr.length - 1);
        //定义一个字段存放随机索引元素
        char temp = arr[randomIndex];
        //将随机索引的元素修改为最大索引的元素
        arr[randomIndex] = arr[arr.length - 1];
        //将最大索引的元素修改为随机索引的元素
        arr[arr.length - 1] = temp;
        //将调整位置后的字符数组转为字符串
        return new String(arr);
    }

    //方法：判断指定索引元素内的密码和录入的密码是否一致
    public static boolean checkNamePassword(ArrayList<User> list, int index, String password) {
        return list.get(index).getPassword().equals(password);
    }

    //方法：判断指定索引元素内的手机号码和身份证是否一致
    public static boolean checkIdPhoneNumber(ArrayList<User> list, int index, User u) {
        return (list.get(index).getId().equals(u.getId())) && (list.get(index).getPhoneNumber().equals(u.getPhoneNumber()));
    }
}
