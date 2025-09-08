/*
Develop a Java program that illustrates the usage of the Comparator Interface
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorUsing{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("ta",24));
        list.add(new Student("arunkumar",27));
        list.add(new Student("visva",20));
        list.add(new Student("kalaise",23));
        System.out.println("before sorting : ");
        System.out.println("Students : "+list+"\n");
        Collections.sort(list,new AgeComparator());//sorting of age vise 
        System.out.println("after sorting with age : ");
        System.out.println("Students : "+list+"\n");
        Collections.sort(list,new NameComparator());//sorting of name length vise
        System.out.println("after sorting with name length : ");
        System.out.println("Students : "+list+"\n");

    }
}
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.name.length(),s2.name.length());
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student stu1,Student stu2){
        return Integer.compare(stu1.age,stu2.age);
    }

}
class Student{
    String name;
    int age;
    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "Student Name : "+name+"  age : "+age;
    }
}