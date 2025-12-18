class AccountDetails{
    private int accountNumber;
    private String holderName;
    private double balance;

    public AccountDetails(int accountNumber,String holderName,double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void dithdraw(int amount) {
        balance -= amount;
    }

    public void viewDetails() {
        System.out.println("account number : "+accountNumber);
        System.out.println("holder name : "+holderName);
        System.out.println("balance : "+balance);
    }


}


public class JamunaBank{
    public static void main(String[] args) {
        AccountDetails a1 = new AccountDetails(121,"Sonok kanti",2000.00 );
        a1.viewDetails();
        System.out.println("-------------------");
        a1.deposit(100);
        a1.viewDetails();
        System.out.println("-------------------");
        a1.dithdraw(50);
        a1.viewDetails();
    }
}
// 1 st problem of bacchader oop series
/*
Bank Account System
Create a BankAccount class with account number, holder name, and balance.
Support deposit and withdrawal.
*/