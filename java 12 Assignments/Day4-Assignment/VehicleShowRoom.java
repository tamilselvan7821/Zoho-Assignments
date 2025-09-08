/*
We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
*/
public class VehicleShowRoom{
    public static void main(String[] args) {
        //create of audi,ford,tvs,bajaj vehicles instance of a paritculr calsses

        Audi firstCar=new Audi(10,250000,225000,5,7,"petrol");

        Ford secondCar=new Ford(15,300000,250000,5,10,"diesel");

        Tvs firstBike=new Tvs(50,110000,2,5,"oil","alloys",10);

        Bajaj secondBike=new Bajaj(80,120000,1,4,"oil","alloys",15);

        //print all details

        firstCar.printDetails();
        secondCar.printDetails();
        firstBike.printDetails();
        secondBike.printDetails();
    }
}
class Vehicle{
    int vehicleMileage;
    double vehiclePrice;
}
class Car extends Vehicle{
    double ownershipCost;
    int carWarrenty;
    int carSeatingCapacity;
    String carFuelType;
}
class Bike extends Vehicle{
    int bikeNoOfCylinders;
    int bikeNoOfGears;
    String bikeCoolingType;
    String bikeWheelType;
    int bikeFuelTankSize;
}
class Audi extends Car{
    public Audi(int vehicleMileage,double vehiclePrice,double ownershipCost,int carWarrenty,int carSeatingCapacity,String carFuelType){
        this.vehicleMileage=vehicleMileage;
        this.vehiclePrice=vehiclePrice;
        this.ownershipCost=ownershipCost;
        this.carWarrenty=carWarrenty;
        this.carSeatingCapacity=carSeatingCapacity;
        this.carFuelType=carFuelType;
    }
    protected void printDetails(){
        System.out.println("Car type : Audi\nVehicle Price Rs."+vehiclePrice+"\nvechile Mileage : "+vehicleMileage+"km \nOwnership Cost : "+ownershipCost+"\nWarrenty  : "+carWarrenty+" years\nCar Seating Capacity : "+carSeatingCapacity+"\nCar Fuel Type : "+carFuelType+"\n");
    }

}
class Ford extends Car{
    public Ford(int vehicleMileage,double vehiclePrice,double ownershipCost,int carWarrenty,int carSeatingCapacity,String carFuelType){
        this.vehicleMileage=vehicleMileage;
        this.vehiclePrice=vehiclePrice;
        this.ownershipCost=ownershipCost;
        this.carWarrenty=carWarrenty;
        this.carSeatingCapacity=carSeatingCapacity;
        this.carFuelType=carFuelType;
    }
    protected void printDetails(){
        System.out.println("Car type : Ford\nVehicle Price Rs."+vehiclePrice+"\nvechile Mileage : "+vehicleMileage+"km \nOwnership Cost : "+ownershipCost+"\nWarrenty  : "+carWarrenty+" years\nCar Seating Capacity : "+carSeatingCapacity+"\nCar Fuel Type : "+carFuelType+"\n");
    }

}
class Bajaj extends Bike{
    public Bajaj(int vehicleMileage,double vehiclePrice,int bikeNoOfCylinders,int bikeNoOfGears,String bikeCoolingType,String bikeWheelType,int bikeFuelTankSize){
        this.vehicleMileage=vehicleMileage;
        this.vehiclePrice=vehiclePrice;
        this.bikeNoOfCylinders=bikeNoOfCylinders;
        this.bikeNoOfGears=bikeNoOfGears;
        this.bikeCoolingType=bikeCoolingType;
        this.bikeWheelType=bikeWheelType;
        this.bikeFuelTankSize=bikeFuelTankSize;
    }
    protected void printDetails(){
        System.out.println("Bike type : Bajaj\nVehicle Price Rs."+vehiclePrice+"\nvechile Mileage : "+vehicleMileage+"km \nNo of Cylinders : "+bikeNoOfCylinders+"\nNo of Gears : "+bikeNoOfGears+"\nwheel type : "+bikeWheelType+"\nCooling type : "+bikeCoolingType+"\nTank size : "+bikeFuelTankSize+" inch"+"\n");
    }

}
class Tvs extends Bike{
    public Tvs(int vehicleMileage,double vehiclePrice,int bikeNoOfCylinders,int bikeNoOfGears,String bikeCoolingType,String bikeWheelType,int bikeFuelTankSize){
        this.vehicleMileage=vehicleMileage;
        this.vehiclePrice=vehiclePrice;
        this.bikeNoOfCylinders=bikeNoOfCylinders;
        this.bikeNoOfGears=bikeNoOfGears;
        this.bikeCoolingType=bikeCoolingType;
        this.bikeWheelType=bikeWheelType;
        this.bikeFuelTankSize=bikeFuelTankSize;
    }
    protected void printDetails(){
        System.out.println("Bike type : Tvs\nVehicle Price Rs."+vehiclePrice+"\nvechile Mileage : "+vehicleMileage+"km \nNo of Cylinders : "+bikeNoOfCylinders+"\nNo of Gears : "+bikeNoOfGears+"\nwheel type : "+bikeWheelType+"\nCooling type : "+bikeCoolingType+"\nTank size : "+bikeFuelTankSize+" inch"+"\n");
    }

}