package test2;

public class Student {
    private String name;
    private int age;


    //如果没有写任何的构造方法
    //那么虚拟机会自动加一个空参构造方法
    public Student(){
        System.out.println("看看我执行了吗");
    }

    public Student(String naem,int age){
        this.name = naem;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
