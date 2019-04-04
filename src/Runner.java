import by.gsu.pms.Game;
import by.gsu.pms.Quest;
import by.gsu.pms.Shooter;
import by.gsu.pms.Strategy;
import java.util.Arrays;


public class Runner {
    public static void main(String[] args){
        Game[] games = new Game[3];
        games[0]= new Strategy("Total war",2002,8,"Windows",6000,20,false);
        games[1]= new Shooter("Wolfenstein",2000,9,"Windows",25,"Современный");
        games[2]=new Quest("Syberia",2002,7,"Windows",6);



        System.out.println("Вывод массива:\n"+Arrays.toString(games));
    }




}
