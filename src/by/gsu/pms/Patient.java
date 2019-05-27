package by.gsu.pms;

public class Patient implements Comparable<Patient> {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int address;
    private int numberMedical;
    private String diagnos;

    public Patient(int id, String firstName, String middleName, String lastName, int address, int numberMedical, String diagnos) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.numberMedical = numberMedical;
        this.diagnos = diagnos;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getNumberMedical() {
        return numberMedical;
    }

    public void setNumberMedical(int numberMedical) {
        this.numberMedical = numberMedical;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", numberMedical=" + numberMedical +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }
    @Override
    public int compareTo(Patient patient){
        return this.firstName.compareTo(patient.firstName);
    }
}
