/*
Create a Java application to manage employees in a company. Define a base class Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that
override calculateSalary() method based on their working type
*/
public class EmployeManagement{
    public static void main(String[] args) {
        //create instance of employees
        Employee fulltime=new FullTimeEmployee(1500,1000);//upcasting 
        fulltime.setDetails(1,"tamil");
        fulltime.calculateSalary();
        PartTimeEmployee parttime=new PartTimeEmployee(200,5);
        parttime.setDetails(2,"kumar");
        parttime.calculateSalary();
        ContractEmployee contract=new ContractEmployee(800,100);
        contract.setDetails(3,"zeigen");  
        contract.calculateSalary(); 

        //print Details
        fulltime.printDetails();
        parttime.printDetails();
        contract.printDetails();     
    }
}
class Employee{
    int employeId;
    String employeName;
    double salary;
    public void setDetails(int employeId,String employeName){
        this.employeId=employeId;
        this.employeName=employeName;
    }
    protected void calculateSalary(){

    }
    public void printDetails(){
        System.out.println("Employe id : "+employeId+"\nEmploye Name : "+employeName+"\nSalary per month : "+salary+"\n");
    }
}
class FullTimeEmployee extends Employee{
    double daySalary;
    double allowance;
    public FullTimeEmployee(double daySalary,double allowance) {
        this.daySalary=daySalary;
        this.allowance=allowance;
    }
    protected void calculateSalary(){
        salary=(daySalary+allowance)*30;
    }
}
class PartTimeEmployee extends Employee{
    double perHour;
    double howmanyTime;
    public PartTimeEmployee(double perHour,double howmanyTime){
        this.perHour=perHour;
        this.howmanyTime=howmanyTime;
    }
    protected void calculateSalary(){
        salary= perHour*howmanyTime*30;
    }
}
class ContractEmployee extends Employee{
    double daySalary;
    double allowance;
    public ContractEmployee(double daySalary,double allowance){
        this.daySalary=daySalary;
        this.allowance=allowance;
    }
    protected void calculateSalary(){
        salary=(daySalary+allowance)*30;
    }
}