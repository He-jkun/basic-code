package test;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name赋值
    public void setName(String name) {
        //等号右边局部变量：表示测试类中调用方法传递过来的数据
        //等号左边：就表示成员位置的name
        this.name = name;
    }

    //:对外提供name属性
    public String getName() {
        return name;
    }

    //作用：给成员变量age赋值
    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法参数");
        }
    }

    //作用：对外提供age属性
    public int getAge() {
        return age;
    }

    //gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
