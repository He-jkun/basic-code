package Test;

public class WhileTest2 {
    public static void main(String[] args) {
        int x = 121;//定义数字
        int y = x;//定义一个临时变量用于记录x原来的值，用于最后做比较
        int num = 0;//定义一个变量用于记录数字到过来的结果
        while (x != 0) {
            int ge = x % 10;//从右往左获取每一个数字
            x = x / 10;//修改一下x记录的数字
            num = num * 10 + ge;//把当前获取到的数字拼接到最右边
        }
        System.out.println(num == y);//比较
    }
}
