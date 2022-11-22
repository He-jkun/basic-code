package demo07;

public class demo1 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};

        //静态初始化简化格式
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //建议把每一个一维数组，单独写成一行
        //注意：每一个一个维数组其实是二维数组的元素，所以每一个数组之间需要用逗号隔开
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };
        //获取元素
        //System.out.println(arr3[0]);//表示获取二维数组中的第一个一维数组

        //arr[0]:二维数组中的第一个一维数组
        //arr[0][0]：获取二维数组中第一个一位数组中0索引的元素
        //System.out.println(arr3[0][0]);

        //遍历二维数组
        //外循环：遍历二维数组,得到里面的每一个元素
        for (int i = 0; i < arr3.length; i++) {
            //i:表示二维数组中的每一个索引
            //arr3[i]：表示二维数组中的每一个元素（一维数组）
            //内循环：遍历一维数组,得到里面的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                //j:表示一维数组中的每一个索引
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
