import java.util.Scanner;
public class DecimalNumberToBinaryNumber{
    static String convertBinary(int value){
        //int value 32 bits only so create a array size 32
        char arr[]=new char[32];
        int start=31;
        while(value>0){
            char temp=(value%2==0)?'0':'1';
            arr[start]=temp;
            value/=2;
            start--;
        }
        //char array convert to string 
        return new String(arr);
    }
    static String convertBinarys(int value){
        char arr[]=new char[32];
        for(int i=31;i>=0;i--){
            if((value&1)==0)arr[i]='0';
            else arr[i]='1';
            value=value>>1;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the decimal Number (convert binary number) : ");
        int value=scan.nextInt();
        //that's print mod operator use to create 
        System.out.println(convertBinary(value));
        //that's use right shift operator 
        System.out.println(convertBinarys(value));
    }
}
