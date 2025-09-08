/*
Develop a Java program which illustrates the usage of Comparable Interface
*/
import java.util.ArrayList;
import java.util.Collections;

public class ComparableUsing{
    public static void main(String[] args) {
        ArrayList<Car>car=new ArrayList<>();
        car.add(new Car("Audi",1500000));
        car.add(new Car("Honda",100000));
        car.add(new Car("TATA",300000));
        car.add(new Car("Hundai",200000));
        //before sort 
        System.out.println("beforing sort : ");
        System.out.println(car);
        Collections.sort(car);
        //after sort 
        System.out.println("After sort : ");
        System.out.println(car);
    }
}
class Car implements Comparable<Car>{
    String model;
    double price;
    Car(String model,double price){
        this.model=model;
        this.price=price;
    }
    @Override
    public int compareTo(Car car){
        Car temp=car;
        if(temp.price>price)return -1;
        if(temp.price<price)return 1;
        return 0;
    }
    public String toString(){
        return "Car Model : "+model+" Price : Rs."+price;
    }
}