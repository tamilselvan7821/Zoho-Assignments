/*
 Develop a Java program to illustrate the usage of toString() method.
*/
public class ToStringMethod{
    public static void main(String[] args) {
        //create instance of a student class
        Student student=new Student("tamil");
        //print student thts print class name and Hexadecimal
        System.out.println("before over ride toString : "+student);

        //over ride employee instance in to String 
        Employee employee=new Employee("kumar");
        System.out.println("after over ride toString : "+employee);
    }
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Employe name : "+name;
    }
}