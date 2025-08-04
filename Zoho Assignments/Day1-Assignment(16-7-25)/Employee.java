/*
Write a class Employee with attributes empId, name, department and salary and define a parameterized constructor
Employee(int empId, String name, String department, double salary) and assign these variables to instance variables
accordingly and display them? Learn variable shadowing.
*/
public class Employee{
    private int empid;
    private String name;
    private String department;
    private double salary;
    //constructor to intialize the value of the employe
    Employee(int empid,String name,String department,double salary){
        this.empid=empid;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    void showDetails(){
        System.out.println("Employe id : "+empid+"\nName : "+name+"\nDepartment : "+department+"\nSalary : "+salary);
    }
    public static void main(String[] args) {
        //create instatnce of a class and create new employe 
        Employee first=new Employee(101,"tamil selvan","Mechanical",10000.00);
        //show the details on the employe
        first.showDetails();
    }
}