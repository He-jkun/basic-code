package test5;

public class PhoneTest {
    public static void main(String[] args) {
        //定义数组
        Phone[] arr = new Phone[3];

        //创建Phone的对象
        Phone p1 = new Phone("华为", 500, "黑色");
        Phone p2 = new Phone("小米", 600, "白色");
        Phone p3 = new Phone("苹果", 100, "绿色");

        //将对象储存到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机价格的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }

        //获取三部手机的平均价格
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
