package work3;

public class Coder {
    String name;
    int id;
    double salary;

    public Coder() {
    }

    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员" + name + "正在努力写着代码");
    }
}
