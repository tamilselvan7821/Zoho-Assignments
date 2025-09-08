import java.util.Scanner;
public class AddTwoIntegerString{
    private static String getSum(String s,String t){
        int len=(s.length()>t.length())?s.length():t.length();
        char arr[]=new char[len+1];
        int carry=0;
        int i=s.length()-1;
        int j=t.length()-1;
        while(len>0||carry>0){
            int a=(i>=0)?s.charAt(i--)-'0':0;
            int b=(j>=0)?t.charAt(j--)-'0':0;
            int sum=carry+a+b;
            arr[len--]=(char)((carry+a+b)%10+'0');
            carry=sum/10;
        }
        return new String(arr,len+1,arr.length-1-len);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //input from two Strings
        System.out.print("Enter first Integer Value : ");
        String first=scan.nextLine();
        System.out.print("Enter second Integer Value : ");
        String second=scan.nextLine(); 
        System.out.println("Total of : "+getSum(first,second));//print total
    }
}