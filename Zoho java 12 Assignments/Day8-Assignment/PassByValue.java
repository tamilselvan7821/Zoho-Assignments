/*
 Develop a Java program to illustrate pass-by-value.
*/
public class PassByValue{
    private static void modify(int value){
        value=100;
        System.out.println("block of code inside value is : "+value);
    }
    private static void modifyReference(Student obj){
        obj.name="selvan";
        System.out.println("block of code inside reference name : "+obj.name);
    }
    public static void main(String[] args) {
        //passing the value in the addition method
        int value=10;
        System.out.println("original value is : "+value);
        //change the value
        modify(value);
        System.out.println("modify value is : "+value);//don't modify the original value

        //reference change value
        Student first=new Student("tamil");
        System.out.println("original reference name : "+first.name);
        modifyReference(first);
        System.out.println("modify reference name : "+first.name);
    }
}
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}