/*
Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such
that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from
outside the class.
*/
public class VechicleShowRoom{
    public static void main(String[] args) {
        Vechicle car1=new Vechicle(1,"Honda",50000);

        Vechicle car2=new Vechicle(2,"BMW",150000);

        Vechicle car3=new Vechicle(3,"Hundai",200000);
        //printCount method is showed in currently inside the  vechicle total count
        car3.printCount();//output : 3 

        Vechicle car4=new Vechicle(4,"Mahindra",50000);

        Vechicle car5=new Vechicle(5,"TATA",50000);

        Vechicle car6=new Vechicle(6,"SUZIKI",50000);
        //printCount method is showed in currently inside the vechicle total count
        car6.printCount();//output : 6
    }
}
class Vechicle{
    private int vechicle_id;
    private String brandName;
    private double price;
    static int count;
    public Vechicle(int vechicle_id,String brandName,double price){
        this.vechicle_id=vechicle_id;
        this.brandName=brandName;
        this.price=price;
        count++;
    }
    void printCount(){
        System.out.println("Current Cars in the Shop : "+count);
    }
}