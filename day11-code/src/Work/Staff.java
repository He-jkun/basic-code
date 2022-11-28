package Work;

public class Staff {
    private String name;
    private int wages;

    public Staff() {
    }

    public Staff(String name, int wages) {
        this.name = name;
        this.wages = wages;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return wages
     */
    public int getWages() {
        return wages;
    }

    /**
     * 设置
     *
     * @param wages
     */
    public void setWages(int wages) {
        this.wages = wages;
    }
}
