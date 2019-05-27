package by.gsu.pms;

import java.io.Serializable;

public class Milk implements Serializable {
    private String name;
    private double percent;
    private boolean availability;

    public Milk(){}

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

    public double getPrecent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    @Override
    public String toString(){
        return "Название=" + this.name + "; Процент жирности= " + this.percent + "; Наличие на складе " + this.availability;
    }

}
