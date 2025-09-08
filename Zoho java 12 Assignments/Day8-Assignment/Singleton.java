/*
 Illustrates with an example of using Singleton class
*/
public class Singleton{
    public static void main(String[] args) {
        //Every time my password get give first time password

        //first person create locker and set password
        IamSingleton firstTime=IamSingleton.singlton(13);
        System.out.println("my password "+firstTime.password);

        //second person create locker and password
        //but not set the value .....
        IamSingleton secondTime=IamSingleton.singlton(14);
        System.out.println("my password "+secondTime.password);

    }
}
class IamSingleton{
    int password=123;
    private static IamSingleton single;
    private IamSingleton(int password){
        this.password=password;
    }
    static IamSingleton singlton(int value){
        if(single==null){
            single=new IamSingleton(value);
        }
        return single;
    }
}