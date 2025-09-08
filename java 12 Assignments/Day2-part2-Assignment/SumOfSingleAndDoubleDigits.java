import java.util.Scanner;
public class SumOfSingleAndDoubleDigits{
    private static void printNumbers(int arr[],Scanner scan){
        int singleDigit=0,doubleDigit=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            int temp=scan.nextInt();
            arr[i]=temp;
            int ch=Math.abs(temp);//convert minus value
            if(ch<10)singleDigit+=temp;
            else if(ch<100)doubleDigit+=temp;
        }
        System.out.println("Single Digit Sum : "+singleDigit);//print single digit sum
        System.out.println("Double Digit Sum : "+doubleDigit);//print double digit sum
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the lenth of the Array : ");
        int len=scan.nextInt();
        int arr[]=new int[len];
        printNumbers(arr,scan);
        scan.close();
    }
}