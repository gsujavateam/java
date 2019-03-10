package by.gsu.pms;
import java.util.Comparator;


public class Milk implements Comparable <Milk> {
    private String name;
    private double percent;
    private boolean availability;

    public Milk() {
    }

    public Milk(String name, double percent, boolean availability) {
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

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public int compareTo(Milk o1) {
        int result = this.name.compareTo(o1.name);

        return result;
    }

    public static Comparator<Milk> PercentComparator = new Comparator<Milk>() {
        @Override
        public int compare(Milk o1, Milk o2) {
            return Double.compare(o1.getPercent(), (o2.getPercent()));
        }
    };

    @Override
    public String toString() {
        return "Название=" + this.name + "; Процент жирности= " + this.percent + "; Наличие на складе " + this.availability;
    }

}