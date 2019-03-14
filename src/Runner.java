import by.gsu.pms.Density;
import by.gsu.pms.Name;




public class Runner {

    public static void main(String[] args){
        Density density = new Density("Wire",new Name("Steel",7850),0.03);
        System.out.println(density);
        density.setMaterial(new Name("Cuprum",8500));
        System.out.println(density.getMass());
        density.setMaterial(new Name("Steel",7850));
        System.out.println(density);





    }
}