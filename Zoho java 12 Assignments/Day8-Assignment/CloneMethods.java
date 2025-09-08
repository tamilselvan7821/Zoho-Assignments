

/*
Write a program to illustrate the usage of clone() and find out what kind of copy it will make
*/
public class CloneMethods{
    public static void main(String[] args) {
        //shallow copy that's work in only share the reference not make original copy
        ShallowCar car=new ShallowCar("AUDI",100000);
        ShallowEmployee shallowEmp=new ShallowEmployee("tamil",car);
        //print sahalloEmp
        System.out.println("shallow copy : ");
        System.out.println(shallowEmp);
        ShallowEmployee copyShallow=null;
        try {
            copyShallow=(ShallowEmployee)shallowEmp.clone();
            copyShallow.car.model="Hundai";
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //change originla values
        System.out.println("change the details : ");
        System.out.println(shallowEmp);
        System.out.println(copyShallow);


        //deep copy that's copy the original copy
        DeepCar deepCar=new DeepCar("TATA",555555);
        DeepEmployee deepEmp=new DeepEmployee("arun",deepCar);
        //print Deep copy instance
        System.out.println("Deep copy : ");
        System.out.println(deepEmp);
        DeepEmployee copyDeep=null;
        try {
            copyDeep=(DeepEmployee)deepEmp.clone();
            copyDeep.car.model="Mahindra";
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //change originla values
        System.out.println("change the details : ");
        System.out.println(deepEmp);
        System.out.println(copyDeep);
    }
}
class ShallowEmployee implements Cloneable{
    String name;
    ShallowCar car;
    public ShallowEmployee(String name,ShallowCar car){
        this.name=name;
        this.car=car;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Employee name : "+name+"\t car : "+car;
    }
}
class ShallowCar implements Cloneable{
    String model;
    double price;
    ShallowCar(String model,double price){
        this.model=model;
        this.price=price;
    }
    public String toString(){
        return "Car Model : "+model+" Price : Rs."+price;
    }
}

class DeepEmployee implements Cloneable{
    String name;
    DeepCar car;
    public DeepEmployee(String name,DeepCar car){
        this.name=name;
        this.car=car;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        DeepEmployee temp=(DeepEmployee)super.clone();
        temp.car=(DeepCar)car.clone();
        return temp;
    }
    @Override
    public String toString(){
        return "Employee name : "+name+"\t car : "+car;
    }
}
class DeepCar implements Cloneable{
    String model;
    double price;
    DeepCar(String model,double price){
        this.model=model;
        this.price=price;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Car Model : "+model+" Price : Rs."+price;
    }
}
