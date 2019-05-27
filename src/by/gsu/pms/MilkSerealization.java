package by.gsu.pms;

import java.io.*;

public class MilkSerealization {
    public static final String FILENAME = "src/Milk.txt";
    public static void serialize(Milk obj[]) {
        FileOutputStream outFile;
        try{
            outFile = new FileOutputStream(FILENAME);
            ObjectOutputStream oos = new ObjectOutputStream(outFile);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            outFile.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Milk[] deSerialize(){
        Milk out[] = null;
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(FILENAME);
            ObjectInputStream oin = new ObjectInputStream(inFile);
            out = (Milk[]) oin.readObject();
            oin.close();
            inFile.close();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return out;
    }
}
