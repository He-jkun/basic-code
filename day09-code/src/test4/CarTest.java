package test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //定义数组
        Car[] arr = new Car[3];
        //创建汽车对象，数据用键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入第" + (i + 1) + "辆车的品牌、价格、颜色");
            String brand = sc.next();
            c.setBrand(brand);
            int price = sc.nextInt();
            c.setPrice(price);
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}
