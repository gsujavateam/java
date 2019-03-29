package by.gsu.pms;


public class Game {
private String name;
private int release;
private int rating;
private String os;

    public Game() {
    }


    public Game(String name, int release, int rating, String os) {
        this.name = name;
        this.release = release;
        this.rating = rating;
        this.os = os;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getTitle(){
        return getName();
    }

    @Override
    public String toString() {
        return   "; Дата релиза: " + release + "; Рейтинг: " + rating + "; Операционная система: " + os + "; ";
    }
}
