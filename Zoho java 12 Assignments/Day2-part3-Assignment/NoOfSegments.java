import java.util.Scanner;
public class NoOfSegments{
    private static int countSegments(String str){
        int result=0;
        boolean ch=true;
        for(int i=0;i<str.length();i++){
            char temp=str.charAt(i);
            if(temp==' '){
                ch=true;
            }
            else if(temp!=' '&&ch){
                ch=false;
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scan.nextLine();
        System.out.println("No Of Segments of String : "+countSegments(str));//print count
    }
}