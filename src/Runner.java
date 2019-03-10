import by.gsu.pms.Milk;
import java.util.Arrays;



public class Runner {

    public static void main(String[] args) {
        Milk[] milks = {
                new Milk("Brestlitovsk",3,true),
                new Milk("MilkMilk",1,true),
                new Milk("Slivki",20,true),
                new Milk("Prostokvasheno",3,false),
                new Milk("GomelMilk",2,true),
                new Milk("PolandMilk",1.5,false),
                new Milk("MyMy",0.5,false),
                new Milk("Neskvik",2,true),
                new Milk("Ukki",3,true),
                new Milk("StrongMilk",3.5,true)};


        double resultpercent = 0;
        for(int i = 0;i<milks.length;i++){
            resultpercent = milks[i].getPercent() + resultpercent;
        }
        double percentMilk = resultpercent / milks.length;
        System.out.println("Средний процент жирности " + percentMilk);
        System.out.println("Вывод массива:\n"+Arrays.toString(milks));

        System.out.println("Сортировка по Названию:");
        Arrays.sort(milks);
        for(int i = 0; i < milks.length; i++){
            System.out.println(milks[i].getName() +";"+ milks[i].getPercent() +";"+ milks[i].getAvailability());
        }
        System.out.println("Сортировка по проценту жирности:");
        Arrays.sort(milks,Milk.PercentComparator);
        for(int i = 0; i < milks.length; i++) {
            System.out.println(milks[i].getName() + ";" + milks[i].getPercent() + ";" + milks[i].getAvailability());
        }

        int a = 0;
        for(int i = 0; i<milks.length;i++){
            if(milks[i].getAvailability()){
                a++;
            }
        }
        System.out.println("Количество видов молока на складе: " + a);




    }
}
