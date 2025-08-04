import java.util.Scanner;
public class FindGrade{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int average=0;
        //recieve input from user Average
        while(true){
            System.out.print("Enter the Average mark out of 100 : ");
            average=scan.nextInt();
            if(average>=0&&average<=100)break;
        }

        //use if satement
        if(average>=85)System.out.println("A");
        else if(average>=70)System.out.println("B");
        else if(average>=50)System.out.println("C");
        else System.out.println("Fail");

        //use of switch statement
        switch(average/10){
            case 10:
            case 9:
            case 8:if(average>=85)System.out.println("A");
                    else System.out.println("B");break;
            case 7:System.out.println("B");break;
            case 6:
            case 5:System.out.println("C");break;
            default : System.out.println("Fail");
        }
    }
}