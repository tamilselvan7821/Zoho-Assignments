

/*
Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid
CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable
*/
public class CloneMethodIllustrate{
    public static void main(String[] args) {
        ImplementsCloneableStudent isClone=new ImplementsCloneableStudent("arun",7676,"EEE");
        System.out.println("original clone : "+isClone);//print clone
        ImplementsCloneableStudent copyClone=null;
        try {
            //created the clone of a student
            copyClone=(ImplementsCloneableStudent)isClone.clone();
            System.out.println("copy of clone : "+copyClone);
        } catch (CloneNotSupportedException e) {
        }
        //show the no implement cloneable interface throw runtime exception of CloneNotSupportedException 
        NotImplementsCloneableStudent notClone=new NotImplementsCloneableStudent("tamil",1234,"MECH");
        //clone the instance
        try{
            NotImplementsCloneableStudent copyNotClone=(NotImplementsCloneableStudent)notClone.clone();
        }
        catch(CloneNotSupportedException e){e.printStackTrace();}
    }
}
class ImplementsCloneableStudent implements Cloneable{
    String name;
    int rollNo;
    String department;
    public ImplementsCloneableStudent(String name,int rollNo,String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Student name : "+name+" rollno : "+rollNo+" Department : "+department;
    }
}

class NotImplementsCloneableStudent{
    String name;
    int rollNo;
    String department;
    public NotImplementsCloneableStudent(String name,int rollNo,String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Student name : "+name+" rollno : "+rollNo+" Department : "+department;
    }
}