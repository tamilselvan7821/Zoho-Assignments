/*
Design a class named BankAccount that uses the concept of encapsulation. The class should have the following
private data members: account number, account holder name, and balance. Provide public getter and setter methods to
access and modify these fields. Also, include a method to deposit and withdrawal of amount ensuring that the balance
cannot go negative.
*/
import bank.BankAccount;
import java.util.Scanner;
public class BankManagementSystem{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //create user bank account
        BankAccount user1=new BankAccount();

        //fillout details
        System.out.print("Enter your account no : ");
        user1.setAccountNumber(scan.nextInt());scan.nextLine();
        System.out.print("Enter your account holder name : ");
        user1.setAccountHolderName(scan.nextLine());
        while(true){
            System.out.print("Enter Balnce Amount (above or equal to 1000): ");
            double temp=scan.nextDouble();
            if(temp>999){
                user1.setBalance(temp);
                break;
            }
        }
        scan.nextLine();   
        //running methods are withdraw,deposit,balance   
        while(true){
            System.out.println("press 1 > Withdraw");
            System.out.println("press 2 > Deposit");
            System.out.println("press 3 > Balance");
            System.out.println("press 4 > quit");
            System.out.print("Enter input > ");
            String input=scan.nextLine();
            switch (input) {
                case "1":System.out.print("Enter Amount : ");user1.withdraw(scan.nextDouble());scan.nextLine();break;
                case "2":System.out.print("Enter Amount : ");user1.deposit(scan.nextDouble());scan.nextLine();break;
                case "3":System.out.println("Your account balance is : "+user1.getBalance());break;
                case "4":System.out.println("-----program ended-----");return;
                default:System.out.println("Invalid input ...");
            }
        }
    }
}