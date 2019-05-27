package by.gsu.pms;
import java.io.Serializable;
import java.util.Comparator;

public class Milk implements Serializable {
    private String name;
    private int percent;
    private boolean availability;

    public Milk(){}

    public Milk(String name, int percent, boolean availability) {
        this.name = name;
        this.percent = percent;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString(){
        return "Название=" + this.name + "; Процент жирности= " + this.percent + "; Наличие на складе " + this.availability;
    }
    public static Comparator<Milk> PercentComparator = new Comparator<Milk>() {
        @Override
        public int compare(Milk o1, Milk o2) {
            return Integer.compare(o1.getPercent(), (o2.getPercent()));
        }
    };


}