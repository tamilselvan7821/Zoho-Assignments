/*
Write a program that illustrate the execution order of static block and initializer block?
*/
public class StaticAndInitializerBlock{
    //global block or instatance block
    String studentName;
    {
        studentName="tamil selvan";
        System.out.println("Instance block");
    }
    //static block 
    static{
        System.out.println("static block");
    }
    public static void main(String[] args) {
        {
            System.out.println("main method - block");
        }
        //instance of a class create to call or assign values 
        StaticAndInitializerBlock obj=new StaticAndInitializerBlock();
        /*
        ouptput : 
        static block
        main method - initializer block
        Instance block

        In Java, the static block is executed before the main method because it's part of the class loading process.
        The Java Virtual Machine (JVM) goes through a specific sequence when a class is loaded.
        */
    }
}