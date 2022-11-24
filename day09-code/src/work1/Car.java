package work1;

public class Car {
    private String brand;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

}
