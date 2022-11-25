package Test10;

import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args) {
        //1 键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (true) {
            System.out.println("输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {//判断录入的金额是否在范围内
                break;
            } else {
                System.out.print("金额无效,请重新");
            }
        }
        //2 遍历每一个数字，转成中文大写
        String moneyStr = "";//定义一个变量用来表示钱的大写
        while (true) {
            int ge = money % 10;//从右往左获取数据，因为右侧数据是个位
            String capitalNumber = getCapitalNumber(ge);//获取到的数字转换为大写并用一个变量储存
            moneyStr = capitalNumber + moneyStr;//把转换之后的大写拼接到moneyStr当中
            money = money / 10;//去掉刚刚获取的数据
            if (money == 0) {//如果数字上的每一位都全部获取到了，那么money记录的就是0，此时循环结束
                break;
            }
        }
        //3 在前面补0，补齐七位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        //4 插入单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};//定义一个数组表示单位
        String result = "";//定一个变量存放最终结果
        for (int i = 0; i < moneyStr.length(); i++) {//遍历moneyStr，依次得到数字中文大写
            char c = moneyStr.charAt(i);//定义字符串存储每一个中文大写数字
            result = result + c + arr[i];
        }
        System.out.println(result);
    }

    public static String getCapitalNumber(int number) {
        //定义数组，让数字和大写中文产生关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //返回结果
        return arr[number];
    }
}
