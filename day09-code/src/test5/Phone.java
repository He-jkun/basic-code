package test5;

public class Phone {
    private String brand;
    private int price;
    private String colo;

    public Phone() {
    }

    public Phone(String brand, int price, String colo) {
        this.brand = brand;
        this.price = price;
        this.colo = colo;
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
     * @return colo
     */
    public String getColo() {
        return colo;
    }

    /**
     * 设置
     *
     * @param colo
     */
    public void setColo(String colo) {
        this.colo = colo;
    }

}
