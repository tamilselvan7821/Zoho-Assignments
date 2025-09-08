/*
8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use auto-boxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed)
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountUsingArrayList{
    static List<Account>bankAccounts=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static void createAccount() throws MyException{
        System.out.print("Enter your name : ");String name=scan.nextLine();
        System.out.print("Enter Account no : ");int acNo;double balance;
        try {
            acNo=Integer.parseInt(scan.nextLine());
            System.out.print("Enter balance above Rs.1000 : ");
            balance=Double.parseDouble(scan.nextLine());
            if(balance<1000)throw new MyException("Enter above Rs.1000");
            Account temp=new Account();
            temp.setHolderName(name);
            temp.setAccountNumber(acNo);
            temp.setBalance(balance);
            bankAccounts.add(temp);
            System.out.println("Successfully account created...");
        } catch (MyException e) {
            e.printStackTrace();
            createAccount();
        }catch (Exception e) {
            System.out.println("Enter valid input ....");
            createAccount();
        }
    }
    static Account searchAccount()throws Exception{
        System.out.print("Enter Account No : ");
        int ac;
        Account getAccount=null;
        try {
            ac=Integer.parseInt(scan.nextLine());
            for(Account a:bankAccounts)if(ac==a.getAccountNumber()){
                getAccount=a;
                break;
            }
            if(getAccount==null)throw new MyException("Account does't exits...");
        } catch (NumberFormatException e) {
            System.out.println("Enter valid Account no .....");
            searchAccount();
        }
        catch(MyException e){
            e.printStackTrace();
        }
        return getAccount;
    }
    static void logInAccount()throws Exception{
        Account run=searchAccount();
        while(true){
            System.out.println("press 1 > Apply Interest");
            System.out.println("press 2 > Show my Details");
            System.out.println("press 3 > back");
            System.out.print("Enter input  > ");
            String ins=scan.nextLine();
            if(ins.equals("1")){
                Double rate=Double.valueOf(run.RATE);
                //Auto unboxing
                System.out.println("Auto-unboxing : ");
                double balance=run.getBalance();
                Double tempBalance=run.getBalance();
                double inter=(balance*rate/100);
                double temp=inter+balance;
                System.out.print("current balance : Rs."+balance+"  Interset earn : Rs."+inter+"  New Balance : Rs."+temp+"\n");System.out.println();
                run.setBalance(temp);
                run.setInterest(inter+run.getInterest());

                //manual unboxing
                System.out.println("Manual unboxing : ");
                double manual=tempBalance.doubleValue();
                System.out.print("current balance : Rs."+manual+"  Interset earn : Rs."+inter+"  New Balance : Rs."+temp+"\n");
            }
            else if(ins.equals("2")){
                System.out.println("Name : "+run.getHolderName()+"  Account No : "+run.getAccountNumber()+"  Balance : Rs."+run.getBalance()+"  Total interest Earned :  Rs."+run.getInterest());System.out.println();
            }
            else if(ins.equals("3")) return;
            else System.out.println("Invalid input...");
        }
    }
    public static void main(String[] args) throws Exception{
        while(true){
            System.out.println("press 1 > Create Account");
            System.out.println("press 2 > Log in Account");
            System.out.println("press 3 > Quit");
            System.out.print("Enter input > ");
            String input=scan.nextLine();
            switch(input){
                case "1":createAccount();break;
                case "2":logInAccount();break;
                case "3":System.out.println("-----program Ended-----");return;
                default:System.out.println("Invalid input..");
            }
        }
    }
}
class Account{
    private int accountNumber;
    private String holderName;
    private Double balance;
    private Double interest=0.0;
    public static final double RATE=5.0;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}