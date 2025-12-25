class MobilePhone{
    private String brandName;
    private String modelName;
    private int batteryPercentage;

    public MobilePhone(String brandName,String modelName,int batteryPercentage) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryPercentage = batteryPercentage;
    }
    public void chargeBattery(int charge){
        batteryPercentage += charge;
    }
    public void useBattery(int charge) {
        batteryPercentage -= charge;
    }

   public void showDetails () {
        System.out.println("Brand name : "+brandName);
        System.out.println("Model name : "+modelName);
        System.out.println("Bettery percentage : "+batteryPercentage);
    }
}

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone m1  = new MobilePhone("iphone","15 promax",40);
        m1.showDetails();
        System.out.println("---------------");
        m1.useBattery(20);
        m1.showDetails();
        System.out.println("---------------");
        m1.chargeBattery(30);
        System.out.println("---------------");
        m1.showDetails();
        System.out.println("---------------");
    }
}
