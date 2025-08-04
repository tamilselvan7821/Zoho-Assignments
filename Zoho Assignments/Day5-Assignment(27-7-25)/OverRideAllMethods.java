/*
Can we override private method, constructor, static method, final method? Illustrate with an example.
*/
public class OverRideAllMethods{
    public static void main(String[] args) {
        Dog dog=new Dog();
        //can't over ride private method, constructor, static method, final methods 
    }
}
class Animal{
    public Animal(){
        System.out.println("I am animal....");
    }
    private void sound(){
        System.out.println("humans  are don't understand the Animal language ...");
    }
    public static void sleep(){
        System.out.println("All animals sleeping...");
    }
    public final void place(){
        System.out.println("All animals live in forest");
    }
}
class Dog extends Animal{
    @Override
    public Dog(){
        System.out.println("I am Dog");
    }
    @Override
    private void sound(){
        System.out.println("dogs sound is wow wow ...");
    }
    @Override
    public static void sleep(){
        System.out.println("Dog is sleeping...");
    }
    @Override
    public final void place(){
        System.out.println("Dog live in home");
    }
}