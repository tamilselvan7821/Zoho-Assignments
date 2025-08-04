/*
Write a program to check if a number is a power of 2 using bitwise operator?
*/
public class PowerOfTwo{
    static boolean isPowerOfTwovalue(int value){
        if(value<=0)return false;
        while(value%2==0){
            value=value/2;
        }
        if(value==1)return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwovalue(1024));//input the value 1024 
        // output : true
    }
}