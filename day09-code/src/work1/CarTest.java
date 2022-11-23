package work1;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] car = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            car[i] = c;
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i].getBrand() + "," + car[i].getPrice() + "," + car[i].getColor());
        }
    }
}
