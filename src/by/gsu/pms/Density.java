package by.gsu.pms;

public class Density {
    private final static String name = "wire";
    private Name material;
    private double volume;

    public Density(){}

    public Density(Name densityMaterial,double densityVolume){
        this.material = densityMaterial;
        this.volume = densityVolume;

    }


    public String getName() {
        return name;
    }

    public Name getMaterial() {
        return material;
    }

    public void setMaterial(Name material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getMass(){
        return material.getDensity()*volume;
    }
    @Override
    public String toString(){
        return this.name + ";" + material.toString()+ ";" + this.volume+ ";" + getMass();
    }
}
