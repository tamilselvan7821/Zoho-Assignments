

/*
 Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of
transportation modes such as Bus, Train, and Flight.
* Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode
must implement differently.
* Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the
interface.
* Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base
class/interface.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class TicketBookingSystem{
    public static void main(String[] args) {
        //ticket booking different models of bus,train,flight
        Scanner scan=new Scanner(System.in);
        ArrayList<BusTicket>busList=new ArrayList<>();
        ArrayList<TrainTicket>trainList=new ArrayList<>();
        ArrayList<FlightTicket>flightList=new ArrayList<>();
        while(true){
            System.out.println("press 1 > Bus Ticket Booking");
            System.out.println("press 2 > Train Ticket Booking");
            System.out.println("press 3 > Flight Ticket Booking");
            System.out.println("press 4 > Show Bus Ticket Bookings");
            System.out.println("press 5 > Show Train Ticket Booking");
            System.out.println("press 6 > Show Flight Ticket Booking");
            System.out.println("press 7 > Quit");
            System.out.print("Enter input > ");
            String ins=scan.nextLine();
            switch(ins){
                case "1":BusTicket bus=new BusTicket(scan);bus.bookTicket();busList.add(bus);break;
                case "2":TrainTicket train=new TrainTicket(scan);train.bookTicket();trainList.add(train);break;
                case "3":FlightTicket flight=new FlightTicket(scan);flight.bookTicket();flightList.add(flight);break;
                case "4":System.out.println("Bus Tickets : ");for(BusTicket bs:busList)System.out.println(bs);break;
                case "5":System.out.println("Train Tickets : ");for(TrainTicket ts:trainList)System.out.println(ts);break;
                case "6":System.out.println("Flight Tickets : ");for(FlightTicket bs:flightList)System.out.println(bs);break;
                case "7":System.out.println("-----program Ended-----");return;
                default:System.out.println("Invalid input...");
            }
        }
    }
}
abstract class Ticket{
    Scanner scan;
    int id;
    String name;
    double price;
    abstract void bookTicket();
}
class BusTicket extends  Ticket{
    static double price=50; 
    public BusTicket(Scanner scan) {
        this.scan=scan;
    }
    public void bookTicket(){
        System.out.print("Enter your name : ");
        name=scan.nextLine();
        System.out.print("Enter your id : ");
        id=scan.nextInt();scan.nextLine();
        System.out.println("sucessfully ticket booked");
    }
    public String toString(){
        return "Bus Ticket passenger name : "+name+"\tPassenger id : "+id+"\tTictet price : "+price;
    }
}
class TrainTicket extends Ticket{
    static double price=200; 
    String seatType;
    public TrainTicket(Scanner scan) {
        this.scan=scan;
    }
    public void bookTicket(){
        System.out.print("Enter your name : ");
        name=scan.nextLine();
        System.out.print("Enter your id : ");
        id=scan.nextInt();scan.nextLine();
        System.out.print("Enter your seat type : ");
        seatType=scan.nextLine();
        System.out.println("sucessfully ticket booked");
    }
    public String toString(){
        return "Train Ticket passenger name : "+name+"\tPassenger id : "+id+"\tSeat type : "+seatType+"\tTictet price : "+price;
    }
}
class FlightTicket extends Ticket{
    double price=1000; 
    String windowSeat;
    String acType;
    public FlightTicket(Scanner scan) {
        this.scan=scan;
    }
    public void bookTicket(){
        System.out.print("Enter your name : ");
        name=scan.nextLine();
        System.out.print("Enter your id : ");
        id=scan.nextInt();scan.nextLine();
        System.out.print("You want window seat : ");
        windowSeat=scan.nextLine().toUpperCase();
        if(windowSeat.equals("YES"))price+=1000;
        System.out.print("You want Ac couch : ");
        acType=scan.nextLine().toUpperCase();
        if(acType.equals("YES"))price+=1000;
        System.out.println("sucessfully ticket booked");
    }
    public String toString(){
        return "Flight Ticket passenger name : "+name+"\tPassenger id : "+id+"\tWindow Seat : "+windowSeat+"\tAc Type : "+acType+"\tTictet price : "+price;
    }
}

