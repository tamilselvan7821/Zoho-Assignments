import java.util.Scanner;
public class TwoStringsSubsequence{
    private static boolean isSubSequence(String s,String t){
        int ind=0;
        int left=0;
        while(left<t.length()&&ind<s.length()){
            if(ind==s.length())return true;
            if(t.charAt(left)==s.charAt(ind)){
                ind++;
            }
            left++;
        }
        return ind==s.length();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String first=scan.nextLine();
        System.out.print("Enter the Second String : ");
        String second=scan.nextLine();
        boolean result=isSubSequence(first,second);//check two strings
        //print output
        if(result)System.out.println("Two strings are subsequence...");
        else System.out.println("Two strings are not subsequence...");
    }
}