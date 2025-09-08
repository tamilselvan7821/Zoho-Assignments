/*
Write a program to illustrate that Classes cannot be used for multiple Inheritance.
*/
public class MultipleInheritance{
    public static void main(String[] args) {
        //create instance of a Car in Audicar
        AudiCar audi=new AudiCar();

        //create instance of a Car in Fordcar
        FordCar ford=new FordCar();

        //Don't create instance of TATA car , so that's extends two cars . You achieve the content use inteface
        //interface to achieve the multiple inheritance
        TataCar tata=new TataCar();
    }
}
class Car{
    String carName;
}
class AudiCar extends Car{

}
class FordCar extends Car{

}
/*
class TataCar extends AudiCar,FordCar{

}
*/
interface Audi{
    int seatCapacity=5;
}
interface Ford{
    String fuelType="petrol";
}
class TataCar implements Audi,Ford{

}