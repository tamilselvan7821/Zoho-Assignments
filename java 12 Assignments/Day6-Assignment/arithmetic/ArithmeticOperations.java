package arithmetic;

public class ArithmeticOperations{
    public int addition(int a,int b){
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
    public int multification(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        if(b==0)throw new ArithmeticException("cannot divide by zero");
        return a/b;
    }
    public int modulo(int a,int b){
        if(b==0)throw new ArithmeticException("cannot modulo by zero");
        return a%b;
    }
}