package work3;

public class test {
    public static void main(String[] args) {
    Manager manager = new Manager("张三",123,15000,6000);
    manager.work();
    Coder coder = new Coder("张三",123,15000);
    coder.work();;
    }
}
