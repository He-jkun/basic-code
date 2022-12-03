package waibao;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        double[] student = new double[20];
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入学生" + (i + 1) + "体重(kg)");
            Scanner sc = new Scanner(System.in);
            double studentWeight = sc.nextDouble();
            System.out.println("请输入学生" + (i + 1) + "身高(m)");
            double studentHeight = sc.nextDouble();
            getIBM(studentHeight, studentWeight);
        }
    }

    public static void getIBM(double height, double weight) {
        double IBM = weight / height / height;
        if (IBM >= 18.5 && IBM <= 24.9) {
            System.out.println("IBM值为:" + IBM + "，体型：正常");
        } else if (IBM >= 25 && IBM <= 27.9) {
            System.out.println("IBM值为:" + IBM + "，体型：超重");
        } else if (IBM >= 28) {
            System.out.println("IBM值为:" + IBM + "，体型：肥胖");
        } else if (IBM < 18.5) {
            System.out.println("IBM值为:" + IBM + "，体型：消瘦");
        }
    }
}
