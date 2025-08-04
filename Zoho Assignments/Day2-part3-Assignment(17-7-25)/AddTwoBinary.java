import java.util.Scanner;
public class AddTwoBinary{
    public static String addBinary(String a, String b) {
        int len=(a.length()>b.length())?a.length():b.length();
        char arr[]=new char[len+1];
        int carry=0;
        int i=a.length()-1,j=b.length()-1;
        while(len>0||carry==1){
            int char1=(i>=0)?a.charAt(i--)-'0':0;
            int char2=(j>=0)?b.charAt(j--)-'0':0;
            char temp=((char1+char2+carry)%2)>0?'1':'0';
            arr[len--]=temp;
            carry=((char1==1&&char2==1)||(carry==1&&char1==1||(carry==1&&char2==1)))?1:0;
        }
        
        return new String(arr,len+1,arr.length-len-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first Binary String : ");
        String first=scan.nextLine();
        String second=scan.nextLine();
        System.out.println(addBinary(first,second));//print total sum of two binary values
        scan.close();
    }
}