import by.gsu.pms.Patient;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("src/in.txt"))) {
            List<Patient> patients = new ArrayList<>();
            while (scanner.hasNextLine()){
                patients.add(new Patient(scanner.nextInt(),scanner.next(),scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.next()));
            }
            Collections.sort(patients);
            FileWriter writer = new FileWriter("src/out.txt");
            for (Patient patient : patients){
                int id = patient.getId();
                String firstName = patient.getFirstName();
                String middleName = patient.getMiddleName();
                String lastName = patient.getLastName();
                int address = patient.getAddress();
                int numberMedical = patient.getNumberMedical();
                String diagnos = patient.getDiagnos();
                writer.write(id + " " + firstName + " " + middleName + " " + lastName + " " + address + " " + numberMedical + " " + diagnos+ " " + System.getProperty("line.separator"));
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
