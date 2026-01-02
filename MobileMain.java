class MobileDetalis{
    public Integer batteryFunction(int chargeBattery,int useBattery) {
        int totalBattery = 0;
        totalBattery += chargeBattery;
        totalBattery -= useBattery;

       // System.out.println("remaining battery percent : "+totalBattery);
        return totalBattery;
    }
    public Integer callDuration(int addMin,int useMin) {
        int totalMin = 0;
        totalMin += addMin;
        totalMin -= useMin;
        //System.out.println("total minutes available : "+totalMin);
        return totalMin;
    }
    public Integer balanceChk(int addAmount,int useAmount){
        int totalBalance = 0;
        totalBalance += addAmount;
        totalBalance -= useAmount;

        return totalBalance;
    }
}
public class MobileMain {
    public static void main(String[] args) {
        MobileDetalis md = new MobileDetalis();
        int battery = md.batteryFunction(100, 20);
        int call = md.callDuration(10, 5);
        int balance = md.balanceChk(200, 100);

        System.out.println("Battery percent : "+battery);
        System.out.println("Call duration : "+call);
        System.out.println("Available balance : "+balance);
    }
}
