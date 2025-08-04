/*
Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s
name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default
values for all the fields.
b. Write a parameterized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with
the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parameterized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
*/
public class Employee{
    private String employe_name;
    private int employe_id;
    private String designation;
    private double employe_salary;

    public Employee() {

    }
    public Employee(String employe_name,int employe_id,String designation,double employe_salary){
        this.employe_name=employe_name;
        this.employe_id=employe_id;
        this.designation=designation;
        this.employe_salary=employe_salary;
    }
    public Employee(Employee employe_shadow){
        employe_shadow.printDetails();
    }
    void printDetails(){
        System.out.println("Employe Name : "+employe_name+"\nEmploye Id : "+employe_id+"\nDesignation : "+designation+"\nSalary : "+employe_salary+"\n");
    }
    public static void main(String[] args) {
        //no Orgument Constructor 
        Employee no_orgument=new Employee();
        //print no Orgument Constructor Details
        no_orgument.printDetails();
        //Parameterized Constructor
        Employee parameterConstructor=new Employee("tamil",111,"software Developer",10000.500);
        //print parameter Constructor Details
        parameterConstructor.printDetails();
        //print copy Constructor Details and print
        Employee copyConstructor=new Employee(parameterConstructor);
    }
}