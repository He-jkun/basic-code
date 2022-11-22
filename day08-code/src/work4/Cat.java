package work4;

public class Cat {
    String color;
    String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat(){
        System.out.println(color + "的" + breed + "正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(color + "的" + breed + "正在抓老鼠");
    }
}
