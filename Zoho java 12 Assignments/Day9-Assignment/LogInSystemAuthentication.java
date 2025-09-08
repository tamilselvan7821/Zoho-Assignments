/*
Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and
display a login failure message.
*/
import java.util.Scanner;
import javax.naming.AuthenticationException;
public class LogInSystemAuthentication{
    public void authenticateUser(Scanner scan,Locker user)throws MyException{
        try{
            System.out.print("Enter user name : ");
            String name=scan.nextLine();
            System.out.print("Enter user password : ");
            String pass=scan.nextLine();
            if(!name.equals(user.name))throw new MyException("Login Failure");
            if(!pass.equals(user.pass))throw new MyException("Login Failure");
            System.out.println("Login Sucessfully...");
        }
        catch(Exception e){
            System.out.println("Incorrect name and password");
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        LogInSystemAuthentication system=new LogInSystemAuthentication();
        Locker tamil=new Locker("tamil","123");
        try{
            system.authenticateUser(scan,tamil);
        }
        catch(MyException e){
            System.out.println("Incorrect password and name ");
            e.printStackTrace();
        }
    }
}
class Locker{
    String name;
    String pass;
    Locker(String name,String pass){
        this.name=name;
        this.pass=pass;
    }
}
class MyException extends AuthenticationException{

    public MyException(String message) {
        super(message);
    }
    
}