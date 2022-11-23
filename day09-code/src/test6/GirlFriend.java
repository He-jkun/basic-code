package test6;

public class GirlFriend {
    private String naem;
    private int age;
    private String gender;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String naem, int age, String gender, String hobby) {
        this.naem = naem;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    /**
     * 获取
     *
     * @return naem
     */
    public String getNaem() {
        return naem;
    }

    /**
     * 设置
     *
     * @param naem
     */
    public void setNaem(String naem) {
        this.naem = naem;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     *
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
