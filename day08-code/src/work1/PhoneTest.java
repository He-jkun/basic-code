package work1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("苹果");
        p.setPrice(8999);
        p.setColor("深空灰");
        p.call();
        p.sendMessage();
    }
}
