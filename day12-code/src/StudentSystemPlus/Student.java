package StudentSystemPlus;

public class Student {
    private String id;
    private String name;
    private int age;
    private String home;

    public Student() {
    }

    public Student(String id, String name, int age, String homeAddress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.home = homeAddress;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return home
     */
    public String getHome() {
        return home;
    }

    /**
     * 设置
     *
     * @param home
     */
    public void setHome(String home) {
        this.home = home;
    }
}
