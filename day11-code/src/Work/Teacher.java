package Work;

public class Teacher {
    private String name;
    private String course;

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
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
     * @return course
     */
    public String getCourse() {
        return course;
    }

    /**
     * 设置
     *
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
    }
}
