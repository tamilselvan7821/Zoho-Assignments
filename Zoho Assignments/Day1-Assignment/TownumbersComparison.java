/*
Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
*/
public class TownumbersComparison{
    static void add(String a){a+="b";}
    public static void main(String[] args) {
        int lemon=20;
        int grape=10;
        switch(lemon^grape){
            case 0 : 
                System.out.println("both are same");
                break;
            default : System.out.println("Both are not equal");
        }
        String a=new String("abc");
        add(a);
        System.out.println(a);
        //xor operator use to two int values check in bit-by-bit vise .two are same return 0.
        //output : Both are not equal
    }
}