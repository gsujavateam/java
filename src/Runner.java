import by.gsu.pms.Milk;

import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название: ");
        String name = scan.next();
        System.out.println("Введите жирность: ");
        double percent = scan.nextDouble();
        System.out.println("Наличие: ");
        boolean availability = scan.next() !=null;
        scan.close();

        Milk milks = new Milk(name, percent, availability);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Milk.txt"));
        oos.writeObject(milks);
        oos.flush();
        oos.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Milk.txt"));
        Milk value = (Milk)oin.readObject();
        System.out.println(value.toString());
        oin.close();



    }
}
