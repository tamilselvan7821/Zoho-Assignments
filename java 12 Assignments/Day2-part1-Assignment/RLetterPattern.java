import java.util.Scanner;
public class RLetterPattern{
    static void printRpattern(int value){
        int crossLine=0;
        if(value%2==1)crossLine=value/2+1;
        else crossLine=value/2;
        for(int i=1;i<=value;i++){
            for(int j=1;j<=value-1;j++){
                if(i==1||i==((value+1)/2)||j==1)System.out.print("R ");
                else if((j==value-1)&&((value+1)/2)>=i)System.out.print("R ");
                else if(j==(crossLine)&&(i>((value+1)/2)))System.out.print("R ");
                else System.out.print("  ");
            }
            if(i>(value+1)/2)crossLine+=1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter value ( print R patter no.of line ) : ");
        int value=scan.nextInt();
        printRpattern(value);
    }
}