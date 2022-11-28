package Work;

import java.util.ArrayList;

public class ArrayListWork2 {
    public static void main(String[] args) {
        //请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息
        ArrayList<Teacher> list = new ArrayList<>();
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + "，专业：" + list.get(i).getCourse());
        }
    }
}
