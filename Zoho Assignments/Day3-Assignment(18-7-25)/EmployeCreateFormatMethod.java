/*
Write a program that would print the information (name, year of joining, salary, address) of three employees by
creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use the format method to format the above said output.
*/
public class EmployeCreateFormatMethod{
    private String empName;
    private int yearPassing;
    private double salary;
    private String address;
    public EmployeCreateFormatMethod(String empName,int yearPassing,double salary,String address){
        this.empName=empName;
        this.yearPassing=yearPassing;
        this.salary=salary;
        this.address=address;
    }
    private void printDetails(){
        System.out.printf("Name : %-20sYear Of Passing : %-10d Salary : %-10s Addrees : %-10s\n",empName,yearPassing,salary,address);//
    }
    public static void main(String[] args) {
        //create 4 persons object of a class
        EmployeCreateFormatMethod person1=new EmployeCreateFormatMethod("tamil selvan",2024,10000.555,"7 th street");
        EmployeCreateFormatMethod person2=new EmployeCreateFormatMethod("kalai",2023,20000,"8th street");
        EmployeCreateFormatMethod person3=new EmployeCreateFormatMethod("viswa",2025,30000.500,"3rd street");
        EmployeCreateFormatMethod person4=new EmployeCreateFormatMethod("kumar",2022,40000.800,"1st street");
        //print details in print format method
        person1.printDetails();
        person2.printDetails();
        person3.printDetails();
        person4.printDetails();
    }
}
