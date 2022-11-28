package Test;

import java.util.ArrayList;

public class ArrayListTest7 {
    public static void main(String[] args) {
        /*需求：
        定义Javabean类：Phone
        Phone属性：品牌，价格
        main方法中定义一个集合，存入三个手机对象
        分别为：小米，1000；苹果，8000；锤子，2999
        定义一个方法，将价格低于3000的手机信息返回
         */
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> resultList = lookupPhone(list, 3000);
        for (int i = 0; i < resultList.size(); i++) {
            Phone phone = resultList.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());
        }
    }

    public static ArrayList<Phone> lookupPhone(ArrayList<Phone> list, double price) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= price) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
