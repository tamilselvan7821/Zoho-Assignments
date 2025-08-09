import java.util.Scanner;
public class TenElmentsPrimeNumbersPrint{
    private static void printPrime(int arr[],Scanner scan){
        for(int i=0;i<10;i++){
            System.out.print("Enter the array "+(i+1)+" Element value : ");
            arr[i]=scan.nextInt();
        }
        System.out.print("Array contains Prime values : ");
        for(int a:arr){
            if(checkPrime(a))System.out.print(a+" ");
        }
        System.out.println();
    }
    private static boolean checkPrime(int value) {
        if(value <= 1) return false;
        if(value <= 3) return true;  // 2 and 3 are prime
        if(value % 2 == 0 || value % 3 == 0) return false;
        for(int i = 5; i * i <= value; i += 6) {
            if(value % i == 0 || value % (i + 2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];//store 10 elements
        printPrime(arr,scan);//call the print prime method
        scan.close();
    }
}