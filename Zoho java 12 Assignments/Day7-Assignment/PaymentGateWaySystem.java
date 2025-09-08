/*
Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a
main class where you can accept payment using different methods
*/
public class PaymentGateWaySystem{
    public static void main(String[] args) {
        //payment using credit,depit card and upi 
        CreditCardPayment credit=new CreditCardPayment();
        credit.pay(10000);
        DepitCardPayment depit=new DepitCardPayment();
        depit.pay(20000);
        UPIPayment upi=new UPIPayment();
        upi.pay(30000);
    }
}
interface PaymentMethod{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Successfully amount Rs."+amount+" transfered using Credit card payment");
    }
}
class DepitCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Successfully amount Rs."+amount+" transfered using Depit card payment");
    }
}
class UPIPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("Successfully amount Rs."+amount+" transfered using UPI payment");
    }
}