package test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        //定义数组
        GirlFriend[] arr = new GirlFriend[4];

        //创建对象
        GirlFriend g1 = new GirlFriend("小雪", 18, "女", "做饭");
        GirlFriend g2 = new GirlFriend("白露", 20, "女", "洗衣服");
        GirlFriend g3 = new GirlFriend("霜降", 24, "女", "扫地");
        GirlFriend g4 = new GirlFriend("冬至", 28, "女", "色色");

        //把对象储存到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;

        //计算女朋友平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        int avg = sum / arr.length;

        //统计年龄比平均值低的女朋友有几个
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                count++;
            }
        }
        System.out.println("年龄比平均值低的女朋友有" + count + "个");

        //打印年龄比平均值低的女朋友的所有信息
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getNaem() + "," + arr[i].getAge() + "," + arr[i].getGender() + "," + arr[i].getHobby());
            }
        }
    }
}
