
import java.util.Scanner;

class ElectricBill {
    private double units;
   
    public ElectricBill(double units) {
        this.units = units;
    }

    public double getTotalPrice() {
        double bill = 0;
        if(units < 100) {
            bill = units * 5;
        } else if(units <= 200) {
            bill = units * 7;
        } else {
            bill = units *7;
        }
        return bill;
    }
}

public class ElectricBillMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many watt you used : ");
        double unit = sc.nextDouble();
        ElectricBill e1 = new ElectricBill(unit);
        double money = e1.getTotalPrice();
        System.out.println("Total amount  : "+money);

    }
}
