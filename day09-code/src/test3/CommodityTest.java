package test3;

public class CommodityTest {
    public static void main(String[] args) {
        //创建一个数组
        Commodity[] arr = new Commodity[3];

        //创建三个商品对象
        Commodity c1 = new Commodity("001", "华为P40", 5999, 100);
        Commodity c2 = new Commodity("002", "保温杯", 227.0, 50);
        Commodity c3 = new Commodity("003", "枸杞", 12.7, 70);

        //把商品对象添加到数组中
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            Commodity commodity = arr[i];
            System.out.println(commodity.getName() + "," + commodity.getId() + "," + commodity.getPrice() + "," + commodity.getCount());

        }
    }
}
