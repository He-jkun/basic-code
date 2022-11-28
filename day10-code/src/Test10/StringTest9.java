package Test10;

public class StringTest9 {
    public static void main(String[] args) {
        //获取到说的话
        String talk = "你玩儿的真好，以后不要玩了，你妈，SB";

        //定义一个敏感词库
        String[] arr = {"TMD", "CNM", "SB", "MLGB", "你妈"};

        //循环得到敏感词库中的每一个元素，依次替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }

        System.out.println(talk);
    }
}
