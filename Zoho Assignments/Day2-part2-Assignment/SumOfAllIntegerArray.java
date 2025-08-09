import java.util.Scanner;
public class SumOfAllIntegerArray{
    private static int oddSum(int arr[],Scanner scan){
        int result=0;//add all odd sum value
        for(int i=0;i<10;i++){
            System.out.print("Enter the array "+(i+1)+" Element value : ");
            int temp=scan.nextInt();
            arr[i]=temp;
            if(i%2==1)result+=temp;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];//store 10 elements
        System.out.println(oddSum(arr,scan));//print value
    }
}