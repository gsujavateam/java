import by.gsu.pms.Density;
import by.gsu.pms.Name;




public class Runner {

    public static void main(String[] args){
        Density density = new Density(Name.STEEL,0.03);
        System.out.println(density);
        density.setMaterial(Name.COPPER);
        System.out.println(density.getMass());
        density.setMaterial(Name.STEEL);
        System.out.println(density);





    }
}