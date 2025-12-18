class Car{
    private String brand;
    private String model;
    private int date;
    private double milage;

    public Car(String brand,String model,int date,double milage){
            this.brand = brand;
            this.model = model;
            this.date = date;
            this.milage = milage;
    }
    void showDetails(){
        System.out.println("Brand "+brand);
        System.out.println("Model "+model);
        System.out.println("Date "+date);
        System.out.println("Milage "+milage);
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","air fliyer 1",01022002,23.09);
        c1.showDetails();

        System.out.println("--------------------------");

        Car c2 = new Car("jaguar","land crusher 1",01022004,11.09);
        c2.showDetails();

    }
    
}

/*
Car Information System
A Car class with brand, model, year, and mileage.
Add a method to display details.  bacchader java oop problem number 3
*/
