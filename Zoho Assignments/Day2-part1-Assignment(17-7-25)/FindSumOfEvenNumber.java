import java.util.Scanner;
public class FindSumOfEvenNumber{
    static int printValues(int value){
        if(value<=0)return 0;
        int start=1;
        int sum=0;
        while(start<=value){
            if(start%2==0)sum+=start;
            start++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number (find even number sum): ");
        int value=scan.nextInt();
        System.out.println(printValues(value));
    }
}