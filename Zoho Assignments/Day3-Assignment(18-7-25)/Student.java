/*
Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of
roll_no as '2' and that of name as "John" by creating an object of the class Student
*/
public class Student{
    private String name;
    private int roll_no;
    public static void main(String[] args) {
        Student firstStudent=new Student();//create a student of instance of a class 
        firstStudent.name="tamil selvan";//Assign value of name
        firstStudent.roll_no=121;
        System.out.println("Name : "+firstStudent.name+"\nRoll no : "+firstStudent.roll_no);
        /*
        output : 
        Name : tamil selvan
        Roll no : 121
        */
    }
}