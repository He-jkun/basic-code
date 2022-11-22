package test;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf = new GirlFriend();
        //赋值
        gf.setName("马兴杰");
        gf.setAge(18);
        gf.setGender("女");

        //获取
        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getGender());

        gf.eat();
        gf.sleep();
    }
}
