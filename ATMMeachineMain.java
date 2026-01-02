class AtmMeachine{

    private String pin;
    private double totalBalance;

    public AtmMeachine(String pin,double totalBalance) {
        this.pin = pin ;
        this.totalBalance = totalBalance;
      
    }
    public void addingBalance(String pass,double addAmount) {
        if(pin.equals(pass)) {
            totalBalance += addAmount;
            System.out.println("adding balance successfully : amount = "+addAmount);
        }
        else {
            System.out.println("wrong password");
        }
    }
    public void withdrawBalance(String pass,double withdrawAmount)   {
        if(pass.equals(pin)) {
            totalBalance -= withdrawAmount;
            System.out.println("withdrawl balance successfully : amount = "+withdrawAmount);
        }
        else {
            System.out.println("wrong password");
        }
    }
        public void showTotalBalance() {
            System.out.println("Total balance is : "+totalBalance);
        }
}
//pin verifination ,, balance inquirey ,,withdrawl

public class ATMMeachineMain {
    public static void main(String[] args) {
        AtmMeachine a1 = new AtmMeachine("abcd", 1000);
        a1.showTotalBalance();
        a1.addingBalance("abcd",1000 );
        a1.showTotalBalance();
        a1.withdrawBalance("abcd", 500);
        a1.showTotalBalance();
    }
}
