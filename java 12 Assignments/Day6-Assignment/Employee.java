/*
Design a class Employee with private data members: employee ID, name, designation, department, and monthly
salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the
annual salary of the employee.
*/
public class Employee{
    private int employeeID;
    private String employeename;
    private String employeeDesignation;
    private String employeeDepartment;
    private double employeeMonthlySalary;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeMonthlySalary(double employeeMonthlySalary) {
        this.employeeMonthlySalary = employeeMonthlySalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public double getEmployeeMonthlySalary() {
        return employeeMonthlySalary;
    }
    public double annualSalary(){
        return employeeMonthlySalary*12;
    }
    public static void main(String[] args) {
        //create a instance of employe class
        Employee first=new Employee();
        //set details
        first.setEmployeeID(123);
        first.setEmployeename("tamil selvan");
        first.setEmployeeDesignation("Software Developer");
        first.setEmployeeDepartment("Developer");
        first.setEmployeeMonthlySalary(15000.557);
        //print all details
        System.out.println("Employe Id : "+first.getEmployeeID()+"\nEmploye Name : "+first.getEmployeename()+"\nEmploye Designation : "+first.getEmployeeDesignation()+"\nEmploye Department : "+first.getEmployeeDepartment()+"\nAnnual salary : "+first.annualSalary()+"\n");
    }

}