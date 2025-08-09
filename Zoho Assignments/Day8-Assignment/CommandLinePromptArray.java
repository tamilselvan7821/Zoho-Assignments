/*
Get some strings through the command-line prompt and use an array to store and display them
*/
public class CommandLinePromptArray{
    public static void main(String[] args) {
        //first compile the program and run time using the input the values ....args array 
        System.out.println("command-line prompt values : ");
        for(String a:args)System.out.println(a);
    }
}