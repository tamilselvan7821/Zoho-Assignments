/*
Create a Java application to manage employees in a company. Define an Interface Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class ManageEmployeesInteface{
    static ArrayList<FullTimeEmployee>fullList=new ArrayList<>();
    static ArrayList<PartTimeEmployee>partList=new ArrayList<>();
    private static void createFull(Scanner scan){
        System.out.print("Enter your name : ");
        String name=scan.nextLine();
        System.out.print("Enter your id : ");
        int id=scan.nextInt();
        System.out.print("Enter your one day salary : ");
        double salary=scan.nextDouble();scan.nextLine();
        fullList.add(new FullTimeEmployee(id,name,salary));
    }
    private static void createPart(Scanner scan){
        System.out.print("Enter your name : ");
        String name=scan.nextLine();
        System.out.print("Enter your id : ");
        int id=scan.nextInt();
        System.out.print("Enter your working Hour : ");
        int hour=scan.nextInt();
        partList.add(new PartTimeEmployee(id,name,hour));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //fulltime employees and part time employees object create and print salary
        while(true){
            System.out.println("press 1 > create Full time Empolyee id ");
            System.out.println("press 2 > create Part time Employee id ");
            System.out.println("press 3 > show Full time Employees ");
            System.out.println("press 4 > show Part time Employees");
            System.out.println("press 5 > quit");
            System.out.print("Enter input > ");
            String ins=scan.nextLine();
            switch(ins){
                case "1":createFull(scan);break;
                case "2":createPart(scan);break;
                case "3":System.out.println("Full Time Employees :");for(FullTimeEmployee fs:fullList){fs.calculateSalary();System.out.println(fs);}break;
                case "4":System.out.println("Part Time Employees :");for(PartTimeEmployee ps:partList){ps.calculateSalary();System.out.println(ps);}break;
                case "5":System.out.println("-----program ended-----");return;
                default:System.out.println("Invalid input");
            }
        }       
    }
}
interface Employee{
    int a=4;
    abstract void calculateSalary();
}
class FullTimeEmployee implements  Employee{
    String name;
    int id;
    double salary;
    public FullTimeEmployee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public void calculateSalary(){
        salary=(salary+200)*30;
    }
    public String toString(){
        return "Employe name : "+name+"\tEmploye id : "+id+"\tEmploye salary : "+salary;
    }
}
class PartTimeEmployee implements  Employee{
    String name;
    int id;
    double salary;
    public PartTimeEmployee(int id,String name,int hour){
        this.id=id;
        this.name=name;
        this.hour=hour;
    }
    int hour;
    @Override
    public void calculateSalary(){
        salary=(hour*150)*30;
    }
    public String toString(){
        return "Employe name : "+name+"\tEmploye id : "+id+"\tEmploye salary : "+salary;
    }
}