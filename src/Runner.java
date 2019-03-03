import by.gsu.pms.BusinessTrip;

public class Runner {

    public static void main(String[] args) {
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Artem", 6000, 25),
                new BusinessTrip("Katerina", 25000, 10),
                new BusinessTrip(),
                new BusinessTrip("Alex",7000,3),
                null,
                new BusinessTrip("Kirill",4330,10),
                new BusinessTrip("Dmitry",8540,13)
        };


        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip == null) {
                System.out.println("Object is null \n");
            } else {
                businessTrip.show();
            }
        }

        businessTrips[businessTrips.length-1].setTransportatioExpenses(150);


        int Duration = businessTrips[0].getDays() + businessTrips[1].getDays();
        System.out.println("Duration = "+Duration+"\n");


        BusinessTrip businessTripWithMaxEx = null;
        int totalExpenses = 0;
        int maxTransportExpenses = 0;
        for(BusinessTrip businessTrip: businessTrips){
            System.out.println(businessTrip);
            if(businessTrip!=null){
                totalExpenses+=businessTrip.getTransportationExpenses();
                if(maxTransportExpenses<businessTrip.getTransportationExpenses()){
                    maxTransportExpenses = businessTrip.getTransportationExpenses();
                    businessTripWithMaxEx = businessTrip;
                }
            }
        }

        System.out.println("Sum of total expenses: " + totalExpenses);
        System.out.print("Name employee with maximum total expenses: " + businessTripWithMaxEx.getEmployeeAccount());


    }
}