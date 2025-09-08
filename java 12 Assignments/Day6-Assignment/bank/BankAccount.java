package bank;
public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public void withdraw(double amount){
        if(balance==0||(balance-amount)<0)System.out.println("Your acccount balance is low...");
        else{
            balance-=amount;
            System.out.println("Your acccount balance is Rs."+balance);
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Your acccount balance is Rs."+balance);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}