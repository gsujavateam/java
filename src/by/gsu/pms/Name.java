package by.gsu.pms;

public class Name {
    private String name;
    private double density;

    public Name(){}

    public Name(String name,int density){
        this.name=name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String toString(){
        return this.name + ";" + this.density;
    }

}

