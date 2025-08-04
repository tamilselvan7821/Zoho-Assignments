/*
Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?
*/
public class ScopeOfVariables{
    static String staticVaribale="i am static variable";
    String instanceVariable="i am instance variable";
    
    public static void main(String[] args) {
        String localVariable="i am local variable";
        final String finalVariable="i am final variable";
        {
            String blockVariable="i am block variable";
            System.out.println(blockVariable);
        }
        //create a object or instance of a class...
        ScopeOfVariables obj=new ScopeOfVariables();
        System.out.println(staticVaribale+"\n"+finalVariable+"\n"+localVariable+"\n"+obj.instanceVariable);
        /*
        Ouptput : 
            i am block variable
            i am static variable
            i am final variable
            i am local variable
            i am instance variable
        */
    }
}