/*
All the banks operating in India are controlled by the RBI. RBI has set a well defined guideline (e.g. minimum
interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example,
suppose RBI has set the minimum interest rate applicable to a saving bank account to be 4% annually; however, banks
are free to use the 4% interest rate or to set any rates above it.

Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer,
Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member
variables and methods in each class.
*/
public class BanksOperatingInRbi{
    public static void main(String[] args) {
        //create SBI account 
        SBI sbi=new SBI(new Customer(123,"tamil",9898778877l),new Account(18950,10000));
        System.out.println("SBI bank minimum Interest rate : "+sbi.getRate());
        System.out.println("SBI bank maximum Withraw Limit : "+sbi.getWithrawLimit());

        //create TMB account 
        TMB tmb=new TMB(new Customer(232,"kumar",9667347632l),new Account(23974,20000));
        System.out.println("TMB bank minimum Interest rate : "+tmb.getRate());
        System.out.println("TMB bank maximum Withraw Limit : "+tmb.getWithrawLimit());

        //create SBI account 
        INDIAN ind=new INDIAN(new Customer(876,"zeigen",8736236477l),new Account(32950,30000));
        System.out.println("Sbi bank minimum Interest rate : "+ind.getRate());
        System.out.println("Sbi bank maximum Withraw Limit : "+ind.getWithrawLimit());
    }
}
class Customer{
    int customerId;
    String customerName;
    long customerPh;

    public Customer(int customerId,String customerName,long customerPh) {
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerPh=customerPh;
    }
    
}
class Account{
    int AccountNo;
    double balance;

    public Account(int AccountNo,double balance) {
        this.AccountNo=AccountNo;
        this.balance=balance;
    }
    
}
abstract class RBI{
    Customer customer;
    Account account;
    double rate;
    abstract public double getRate();
    abstract public double getWithrawLimit();
}
class SBI extends RBI{
    public SBI(Customer customer,Account account){
        this.customer=customer;
        this.account=account;
    }
    Customer customer;
    Account account;
    double rate;
    @Override
    public double getRate(){
        return 5.5;
    }
    public double getWithrawLimit(){
        return 500000;
    }
}

class TMB extends RBI{
    public TMB(Customer customer,Account account){
        this.customer=customer;
        this.account=account;
    }
    Customer customer;
    Account account;
    double rate;
    @Override
    public double getRate(){
        return 4;
    }
    public double getWithrawLimit(){
        return 800000;
    }
}

class INDIAN extends RBI{
    public INDIAN(Customer customer,Account account){
        this.customer=customer;
        this.account=account;
    }
    Customer customer;
    Account account;
    double rate;
    @Override
    public double getRate(){
        return 8;
    }
    public double getWithrawLimit(){
        return 1000000;
    }
}