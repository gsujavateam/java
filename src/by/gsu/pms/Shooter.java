package by.gsu.pms;

public class Shooter extends Game {
    private int quantitylevel;
    private String typeWeapon;

    public Shooter() {}

    public Shooter(String name, int release, int rating, String os, int quantitylevel) {
        super(name, release, rating, os);
        this.quantitylevel = quantitylevel;
    }

    public Shooter(String name, int release, int rating, String os, int quantitylevel, String typeWeapon) {
        super(name, release, rating, os);
        this.quantitylevel = quantitylevel;
        this.typeWeapon = typeWeapon;
    }

    public int getQuantitylevel() {
        return quantitylevel;
    }

    public void setQuantitylevel(int quantitylevel) {
        this.quantitylevel = quantitylevel;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }
    @Override
    public String getTitle(){
        return ("Жанр игры Шутер; Название: " + getName());
    }
    @Override
    public String toString() {
        return  getTitle() + super.toString()+" Кол-во уровней: " +quantitylevel+"; Вид оружия: "+typeWeapon+"\n";
    }
}
