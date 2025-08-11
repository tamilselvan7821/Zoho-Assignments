/*
Use Threads to implement the ATM, where you create threads to check the
PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.
*/
import java.util.Scanner;
public class AtmMachine{
    static boolean PIN=false;
    static boolean WITHDRAW=false;
    static double withdrawAmount=0.0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Atm user=new Atm(1234,1000);
        Thread pin=new Thread(){
            public void run(){
                try{
                    Thread.sleep(1000);
                    System.out.print("Enter the pin : ");
                    int pin=Integer.parseInt(scan.nextLine());
                    if(pin==user.pin){
                        Thread.sleep(1000);
                        System.out.println("Checking your pin...");
                        PIN=true;
                        Thread.sleep(1000);
                        System.out.println("pin checking process completed..");
                        Thread.sleep(1000);
                        System.out.println("process changed to amount verfication.....");
                    }
                    else{
                        Thread.sleep(1000);
                        System.out.println("Incorrect pin");System.exit(0);
                    }
                }
                catch(InterruptedException e){}
            }
        };
        Thread amount=new Thread(){
            public void run(){
                try{
                    Thread.sleep(1000);
                    System.out.println("waiting for pin verfication....");
                    if(PIN){
                        Thread.sleep(1000);
                        System.out.print("Enter the amount : Rs.");
                        withdrawAmount=Double.parseDouble(scan.nextLine());
                        PIN=false;
                        if(withdrawAmount<=user.balance){
                            user.balance-=withdrawAmount;
                            Thread.sleep(1000);
                            System.out.println("Collect your cash....");
                            WITHDRAW=true;
                        }
                        else{
                            Thread.sleep(1000);
                            System.out.println("Insufficient Balance...");
                            System.exit(0);
                        }
                    }
                    else{
                        wait();
                    }
                }
                catch(InterruptedException e){}
            }
        };
        Thread recipt=new Thread(){
            public void run(){
                try{
                    Thread.sleep(1000);
                    System.out.println("Checking your pin and amount ");
                    if(WITHDRAW){
                        Thread.sleep(1000);
                        System.out.println("Withdraw Amount Rs."+withdrawAmount+"  Balance Rs."+user.balance);
                        WITHDRAW=false;
                        withdrawAmount=0.0;
                    }
                    else{
                        //Thread.sleep(1000);
                        //System.out.println("Insufficient balance");
                        Thread.currentThread().wait();
                    }
                }
                catch(InterruptedException e){}
            }
        };
        try {
            pin.start();
            pin.join();
            amount.start();
            amount.join();
            recipt.start();
            recipt.join();
        } catch (Exception e) {
        }
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