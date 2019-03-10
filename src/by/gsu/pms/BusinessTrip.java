package by.gsu.pms;

public class BusinessTrip {
    private static final int DAILY_RATE = 450;
    private String employeeAccount;
    private int transportationExpenses;
    private int days;

    public BusinessTrip(){}

    public BusinessTrip(String employeeAccount, int transportationExpenses, int days) {
        this.employeeAccount = employeeAccount;
        this.transportationExpenses = transportationExpenses;
        this.days = days;
    }

    public String getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(String employeeAccount) {
        this.employeeAccount = employeeAccount;
    }

    public int getTransportationExpenses() {
        return transportationExpenses;
    }

    public void setTransportatioExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public static int getDailyRate() {
        return DAILY_RATE;
    }
    public int getTotal(){
        return transportationExpenses+DAILY_RATE*days;
    }

    public void show(){
        System.out.println("Rate:"+ FormatDecimal.convertToForamt(DAILY_RATE,100)+"\n"+"Account:"+ employeeAccount+"\n" + "Transport:" + FormatDecimal.convertToForamt(transportationExpenses,100)+ "\n"+ "Days:"+ days + "\n" + "Total:"+FormatDecimal.convertToForamt(getTotal(),100)+"\n");
    }

    public String toString(){
        return FormatDecimal.convertToForamt(DAILY_RATE,100)+";"+ employeeAccount+";"+ FormatDecimal.convertToForamt(transportationExpenses,100)+ ";" + employeeAccount + ";" + FormatDecimal.convertToForamt(getTotal(),100)+";"+FormatDecimal.convertToForamt(getTotal(),100);
    }
}
