package demo07;

public class demo2 {
    public static void main(String[] args) {
        //创建二维数组 动态初始化
        int[][] arr = new int[3][5];
        //3：表示二维数组长度为3，可以装3个一维数组
        //5：表示一维数组的长度，一个一维数组可以装5个int类型的元素

        //给二维数组赋值一个数字
        arr[0][0] = 10;

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
