package Work;

import java.util.ArrayList;

public class ArrayListWork3 {
    public static void main(String[] args) {
        /*有如下员工信息：
        姓名：张三，工资：3000
        姓名：李四，工资：3500
        姓名：王五，工资：4000
        姓名：赵六，工资：4500
        姓名：田七，工资：5000

        先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
        1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        3、给姓名为“田七”的员工，涨500工资*/

        ArrayList<Staff> list = new ArrayList<>();

        Staff s1 = new Staff("张三", 3000);
        Staff s2 = new Staff("李四", 3500);
        Staff s3 = new Staff("王五", 4000);
        Staff s4 = new Staff("赵六", 4500);
        Staff s5 = new Staff("田七", 5000);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        int index1 = judgeName(list, "王五");
        if (index1 >= 0) {
            list.get(index1).setName("王小五");
        }

        //2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        int index2 = judgeName(list, "赵六");
        if (index2 >= 0) {
            list.remove(index2);
        }

        //3、给姓名为“田七”的员工，涨500工资
        int index3 = judgeName(list, "田七");
        if (index3 >= 0) {
            list.get(index3).setWages(list.get(index3).getWages() + 500);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "," + list.get(i).getWages());
        }
    }

    public static int judgeName(ArrayList<Staff> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
