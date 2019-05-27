import by.gsu.pms.Milk;
import by.gsu.pms.MilkSerealization;

import java.util.Arrays;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество:");
        int quantity = input.nextInt();
        Milk milks[] = new Milk[quantity];
        for (int i = 0; i < quantity; i++){
            System.out.println("Введите название: ");
            String name = input.next();
            System.out.println("Введите жирность: ");
            int percent = input.nextInt();
            System.out.println("Наличие: ");
            boolean availability = input.nextBoolean();
            milks[i] = new Milk(name, percent, availability);
        }

        input.close();

        MilkSerealization.serialize(milks);
        milks = MilkSerealization.deSerialize();

        for (int i = 0; i < milks.length; i++){
            System.out.println(milks[i]);
        }
        System.out.println("Сортировка по проценту жирности:");
        Arrays.sort(milks,Milk.PercentComparator);
        for(int i = 0; i < milks.length; i++) {
            System.out.println(milks[i]);
        }
        int a = 0;
        for(int i = 0; i<milks.length;i++) {
            if (milks[i].getAvailability()) {
                a++;
            }
        }
        System.out.println("Количество видов молока на складе: " + a);
    }
}
