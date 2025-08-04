import java.util.Arrays;
import java.util.Scanner;
public class FibonacciTerm{
    private static void fibonacciArray(int arr[]){
        if(arr.length==0)System.out.println("Array is empty");
        if(arr.length<=1);
        else{
            int first=0;
            int second=arr[1]=1;
            int third=0;
            for(int i=2;i<arr.length;i++){
                third=first+second;
                arr[i]=third;
                first=second;
                second=third;
            }
        }
        System.out.println(Arrays.toString(arr));//print the array
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter fiboncci no.of.term : ");
        int value=scan.nextInt();
        int arr[]=new int[value];
        fibonacciArray(arr);
        scan.close();
    }
}