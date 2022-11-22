package test07;

public class test7 {
    public static void main(String[] args) {
        int number = 12345;
        int temp = number;
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
