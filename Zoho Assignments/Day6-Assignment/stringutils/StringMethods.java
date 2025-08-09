package stringutils;

public class StringMethods{
    public String concateTwoStrings(String a,String b){
        return a+""+b;
    }
    public String reverseString(String a){
        StringBuilder sb=new StringBuilder(a);
        return sb.reverse().toString();
    }
    public int length(String a){
        return a.length();
    }
}