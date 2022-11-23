package test7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "小明", 23);
        Student stu2 = new Student(2, "小王", 24);

        arr[0] = stu1;
        arr[1] = stu2;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(3, "小马", 24);

        //学号唯一性判断
        if (contains(arr, stu4.getId())) {
            //已存在 --- 不添加
            System.out.println("当前学号已存在，不能添加");
        } else {
            //不存在 --- 将学生对象存入新数组
            //判断数组存了几个元素
            int count = getCount(arr);
            if (count == arr.length) {
                //1 数组已满 --- 创建新数组，把对象存入新数组
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                //printArr(newArr);
            } else {
                //2 数组未满 --- 直接添加
                arr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                //printArr(arr);
            }
        }

        //要求3：通过id删除学生信息
        //如果存在，则删除，如果不存在，则提示删除失败

        //1 要找到id在数组中对应的索引
        int index = getIndex(arr, 4);
        if (index >= 0) {
            //1.1 存在 --- 删除
            arr[index] = null;
            printArr(arr);
        } else {
            //1.2不存在 --- 提示删除失败
            System.out.println("当前id不存在，删除失败");
        }
    }

    //创建一个方法：查找id在数组中对应的索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //创建一个方法:遍历并打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }
    }

    //创建一个方法：生成一个新数组长度=老数组长度+1
    //然后把老数组的元素，拷贝到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] arr2 = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    //创建一个方法：判断数组中是否已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建一个方法:判断学号是否已存在
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
