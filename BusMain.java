
import java.util.ArrayList;

class Bus{
    private String busName;
    private String startLocation;
    private String endLocation;
    private double busFair;

    public Bus(String busName,String startLocation,String endLocation,double busFair){
        this.busName = busName;
        this.startLocation = startLocation;
        this.endLocation=endLocation;
        this.busFair=busFair;
    }

    public String getBusName() {
        return busName;
    }
    public String getStartLocation() {
        return startLocation;
    }
    public String getEndLocation() {
        return endLocation;
    }
    public double getBusFair() {
        return busFair;
    }
}


class Passenger{
    private String startPlace;
    private String endPlace;
    public Passenger(String startPlace,String endPlace) {
        this.startPlace=startPlace;
        this.endPlace=endPlace;
    }
    public String getStartPlace() {
        return startPlace;
    }
    public String getEndPlace() {
        return endPlace;
    }
}
    

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus("Ena", "Sylhet", "Dhaka", 700));
        buses.add(new Bus("Shamoli", "Sylhet", "Dhaka", 900));
        buses.add(new Bus("Hanif", "Sylhet", "Dhaka", 800));
        buses.add(new Bus("Ena", "Dhaka", "Cumilla", 500));

       Passenger p1 = new Passenger("Sylhet", "Dhaka");
        boolean found = false;
       for(Bus b:buses) {
        if(b.getStartLocation().equals(p1.getStartPlace())  && b.getEndLocation().equals(p1.getEndPlace())){
            System.out.println("busss name : "+b.getBusName());
            System.out.println("start from : "+p1.getStartPlace());
            System.out.println("start from : "+p1.getEndPlace());
            System.out.println("Fair : "+b.getBusFair());
            System.out.println("-------------------");
            found = true;
        }  
       }
       if(!found) {
        System.out.println("Wrong information or no bus available");
       }
    }
}
