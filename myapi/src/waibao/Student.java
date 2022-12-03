package waibao;

public class Student {
    private String name;
    private double high;
    private double heavy;


    public Student() {
    }

    public Student(String name, double high, double heavy) {
        this.name = name;
        this.high = high;
        this.heavy = heavy;
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
     * @return high
     */
    public double getHigh() {
        return high;
    }

    /**
     * 设置
     *
     * @param high
     */
    public void setHigh(double high) {
        this.high = high;
    }

    /**
     * 获取
     *
     * @return heavy
     */
    public double getHeavy() {
        return heavy;
    }

    /**
     * 设置
     *
     * @param heavy
     */
    public void setHeavy(double heavy) {
        this.heavy = heavy;
    }
}
