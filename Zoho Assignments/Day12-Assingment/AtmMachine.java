/*
Use Threads to implement the ATM, where you create threads to check the
PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.
*/
import java.util.Scanner;
public class AtmMachine{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Atm user=new Atm(1234,1000);
        Thread pin=new Thread(){
            public void run(){
                System.out.print("Enter the pin : ");
                int pin=Integer.parseInt(scan.nextLine());
                if(pin==user.pin){
                    
                }
                else{
                    System.out.println("Incorrect pin ");
                }
            }
        };
        double withdrawAmount=0.0;
        Thread amount=new Thread(){
            public void run(){
                System.out.print("Enter the amount : ");
                withdrawAmount=Double.parseDouble(scan.nextLine());
                if(withdrawAmount<=user.balance){
                    
                }
                else{
                    System.out.println("Insufficient balance");
                }
            }
        };
        Thread pin=new Thread(){
            public void run(){
                System.out.print("Enter the pin : ");
                int pin=Integer.parseInt(scan.nextLine());
                if(pin==user.pin){
                    
                }
                else{
                    System.out.println("Incorrect pin ");
                }
            }
        };
    }
}
class Atm{
    int pin;
    double balance;
    public Atm(int pin,double balance){
        this.pin=pin;
        this.balance=balance;
    }
}