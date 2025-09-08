/*
Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls
method3, which throws the exception). Handle the exception in method1.
*/
public class PropagationHandleUnchecked{
    public static void main(String[] args) {
        //that's work flow is automatically throw exception previous method and first throw top stack 
        Student student=new Student();
        //propagation handle the excetion
        student.tamil();
    }
}
class Student{
    void tamil(){
        try {
            english();
        } catch (Exception e) {
            System.out.println("Exception handle in Arithmetic");
        }
    }
    void english(){
        maths();
    }
    void maths(){
        int result=50/0;
        science();
    }
    void science(){
        System.out.println("science");
    }
}