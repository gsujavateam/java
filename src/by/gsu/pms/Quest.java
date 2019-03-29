package by.gsu.pms;

public class Quest extends Game {
    private int age;

    public Quest() {}

    public Quest(String name, int release, int rating, String os) {
        super(name, release, rating, os);
    }

    public Quest(String name, int release, int rating, String os, int age) {
        super(name, release, rating, os);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getTitle(){
        return ("Жанр игры Квест; Название: " + getName());
    }
    @Override
    public String toString() {
        return  getTitle() + super.toString()+"Возраст: "+ age+"\n";
    }
}
