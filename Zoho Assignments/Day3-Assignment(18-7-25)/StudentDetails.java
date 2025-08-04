/*
Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of
roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/
public class StudentDetails{
    private String name;
    private int roll_no;
    private int phone_no;
    private String address;
    public StudentDetails(String name,int roll_no,int phone_no,String address) {
        this.name=name;
        this.roll_no=roll_no;
        this.phone_no=phone_no;
        this.address=address;
    }
    private void printDetails(){
        System.out.println("Name : "+name+"\nRoll no : "+roll_no+"\nPhone no : "+phone_no+"\nAddress : "+address);
    }
    public static void main(String[] args) {
        StudentDetails firstPerson=new StudentDetails("John",121,987678,"7th street");//create a john details
        firstPerson.printDetails();//print all details of john
        StudentDetails secondPerson=new StudentDetails("Sam",122,454656,"8th street");//create a sam details
        secondPerson.printDetails();//print all details of sam
    }
}