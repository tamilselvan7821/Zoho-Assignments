/*
Write a program to check whether the object is an instance of a particular class?
*/
public class CheckInstanceClass{
    private int empid;
    private String name;
    private String department;
    private double salary;
    //constructor to intialize the value of the employe
    CheckInstanceClass(int empid,String name,String department,double salary){
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
        CheckInstanceClass firstEmploye=new CheckInstanceClass(101,"tamil selvan","Mechanical",10000.00);
        //check instance of a class in a particular class use of instanceof method
        if(firstEmploye instanceof CheckInstanceClass)System.out.println("That's instance of a particular class");
        else System.out.println("That's not instance of a class");
        Employee ob=new Employee(101,"tamil selvan","Mechanical",10000.00);
        Animal animal=new Animal();
        Animal dog=new Dog(); 
        Cat cat=new Cat();
        System.out.println(dog instanceof Animal);
    }
}
class Animal{

}
class Dog extends Animal{

}
class Cat{
    
}