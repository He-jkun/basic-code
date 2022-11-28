package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        /*1、首先需要创建一个图书类，封装图书信息。
        2、提供操作菜单，可以通过键盘录入不同的数字来表示不同的操作，选择结构语句可以实现该需求。
        3、管理图书，需要将图书存放起来，首先需要创建集合容器。
        4、添加图书，即将图书存入集合中，但存入之前需要判定编号的唯一性，如果编号存在，需要重新录入。
        5、查询所有图书，即为遍历集合显示信息。
        6、查询单本图书，需要录入图书名称，遍历集合进行查询。
        7、修改图书信息，需要根据编号先找到该图书，修改其除了编号之外的信息，存入集合覆盖原来的信息。
        8、删除图书信息，需要根据编号先找到该图书，根据索引直接删除即可。
        9、退出系统功能，借助结束程序的API实现即可。*/

        Scanner sc = new Scanner(System.in);

        //创建一个集合用于存放图书对象
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            //在控制台输出系统菜单
            System.out.println("---图书管理系统---");
            System.out.println("1.添加图书");
            System.out.println("2.查询所有图书");
            System.out.println("3.查询单本图书");
            System.out.println("4.删除图书");
            System.out.println("5.修改图书");
            System.out.println("6.退出系统");
            System.out.print("请输入您的选择：");
            //接收用户输入的菜单编号
            String choice = sc.next();
            switch (choice) {
                //根据编号执行对应的操作
                case "1" -> addBook(bookList);
                case "2" -> queryAllBook(bookList);
                case "3" -> queryBook(bookList);
                case "4" -> deleteBook(bookList);
                case "5" -> updateBook(bookList);
                case "6" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("没有该选项");
            }
        }
    }

    //新增图书方法
    public static void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        String id = null;
        while (true) {
            System.out.print("输入图书id：");
            id = sc.next();
            if (checkId(list, id)) {
                System.out.print("id:" + id + "已存在,请重新");
            } else {
                break;
            }
        }
        b.setId(id);
        System.out.print("请输入书名：");
        String name = sc.next();
        b.setName(name);
        System.out.print("请输入作者：");
        String author = sc.next();
        b.setAuthor(author);
        System.out.print("请输入价格：");
        String price = sc.next();
        b.setPrice(price);
        list.add(b);
        System.out.println("图书添加成功");
    }

    //查询全部图书方法
    public static void queryAllBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("暂无图书，请添加后查询");
            return;
        }
        System.out.println("id" + "\t" + "书名" + "\t" + "作者" + "\t" + "价格" + "\t");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAuthor() + "\t" + list.get(i).getPrice() + "\t");
        }
    }

    //查询单本图书方法
    public static void queryBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("暂无图书，请添加后查询");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要查询的书名：");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println("id：" + list.get(i).getId() + " 书名：" + list.get(i).getName() + " 作者" + list.get(i).getAuthor() + " 价格：" + list.get(i).getPrice());
            } else {
                System.out.println("不存在该书");
                return;
            }
        }
    }

    //删除图书方法
    public static void deleteBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("暂无图书，请添加后操作");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要删除的图书id：");
        String id = sc.next();
        int index = queryIndex(list, id);
        if (index < 0) {
            System.out.println("id为：" + id + "的图书不存在，删除失败");
            return;
        } else {
            list.remove(id);
            System.out.println("删除成功");
        }
    }

    //修改图书方法
    public static void updateBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("暂无图书，请添加后操作");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要修改的图书id：");
        String id = sc.next();
        int index = queryIndex(list, id);
        if (index < 0) {
            System.out.println("id为：" + id + "的图书不存在");
            return;
        } else {
            Book b = new Book();
            b.setId(id);
            System.out.print("输入修改后的书名：");
            String name = sc.next();
            b.setName(name);
            System.out.print("输入修改后的作者：");
            String author = sc.next();
            b.setAuthor(author);
            System.out.print("输入修改后的价格：");
            String price = sc.next();
            b.setPrice(price);
            list.set(index, b);
            System.out.println("修改成功");
            return;
        }
    }

    //查找id所在索引的位置
    public static int queryIndex(ArrayList<Book> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    //判断id是否唯一方法
    public static boolean checkId(ArrayList<Book> list, String id) {
        if (queryIndex(list, id) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
