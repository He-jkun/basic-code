package test07;

import java.util.Random;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        //1、生成中奖号码
        int[] arr = createNumber();
        System.out.println("=================");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("=================");

        //2、用户输入彩票号码
        int[] uesrInputArr = userInputNumber();

        //3、对比中奖号码和彩票号码，判断中奖情况
        //创建两个变量用于记录红球和蓝球中奖的次数
        int redCount = 0;
        int blueCount = 0;

        //判断红球中奖情况
        for (int i = 0; i < uesrInputArr.length - 1; i++) {
            //创建一个变量存放彩票号数组的元素
            int redNumber = uesrInputArr[i];
            //用变量与中奖号码的每一个元素比较
            for (int i1 = 0; i1 < arr.length - 1; i1++) {
                if (redNumber == arr[i1]) {
                    //如果相同红球中奖次数加一
                    redCount++;
                    //如果找到了 后面的数字就不用比较了
                    // 可以直接跳出循环,继续判断下一个红球号码
                    break;
                }
            }
        }
        // 判断蓝球中奖情况
        int blueNumber = uesrInputArr[uesrInputArr.length - 1];
        if (arr[arr.length - 1] == blueNumber) {
            blueCount++;
        }

        //根据红球的个数及蓝球的个数来判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元");
        }else {
            System.out.println("谢谢参与");
        }
    }

    //获取用户输入彩票号码方法
    public static int[] userInputNumber() {
        //创建一个数组用于添加用户购买的彩票号
        int[] arr = new int[7];
        //利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        //输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.print("输入第" + (i + 1) + ("个红球号码:"));
            int redNumber = sc.nextInt();
            //redNumber 需要在1～33 且不重复
            if (redNumber >= 1 && redNumber <= 33) {
                if (contains(arr, redNumber) == false) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.print("当请红球号已存在，请重新");
                }
            } else {
                System.out.print("当请红球号超出范围，请重新");
            }
        }

        //输入篮球号码
        while (true) {
            System.out.print("输入蓝球号码:");
            //定义一个变量存放用户输入的蓝球号码
            int blueNumber = sc.nextInt();
            //判断蓝球号码是否在范围内
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.print("蓝球号码超出范围，请重新");
            }
        }
        return arr;
    }

    //随机生成中奖号码
    public static int[] createNumber() {
        //1、创建数组用于添加中奖号码
        //6个红球 + 1个篮球 = 数组长度：7
        int[] arr = new int[7];

        //2、随机生成号码并添加到数组当中
        //红球：1-33且不能重复，所有要校验是否已存在数组中
        //篮球：1-16可以和红球号码重复

        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
            int redNumber = r.nextInt(1, 33);
            //判读红球号码是否已存在数组中
            if (contains(arr, redNumber) == false) {
                //不存在则把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成篮球号码并添加到数组当中
        int blueNumber = r.nextInt(1, 16);
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    //用于判断红球号码在数组中是否已存在
    public static boolean contains(int[] arr, int redNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == redNumber) {
                return true;//存在
            }
        }
        //需要放在循环结束以后，保证校验过所有的数组元素没有相同后在返回结果
        return false;
    }

}


