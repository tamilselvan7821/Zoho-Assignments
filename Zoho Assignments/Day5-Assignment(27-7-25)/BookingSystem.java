/*
Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common
method but implement booking differently.
*/
public class BookingSystem{
    public static void main(String[] args) {
        //book bus ticket
        Bus bus=new Bus();
        bus.booking("tamil", 100);
        bus.welcomeMessage();

        //book train ticket
        Train train=new Train();
        train.booking("kumar",500,"berth");
        train.welcomeMessage();

        //bool flight ticket
        Flight flight=new Flight();
        flight.booking("arun",5000,"Ac",true);
        flight.welcomeMessage();
    }
}
class TicketBooking{
    String name;
    double amount;
    public void welcomeMessage(){
        System.out.println("Welcome to Booking service");
    }
}
class Bus extends TicketBooking{
    @Override
    public void welcomeMessage(){
        System.out.println("Welcome to Lion Bus service\nName : "+name+"\nAmount : Rs."+amount+"\n");
    }
    //over loading
    public void booking(String name,double amount){
        this.name=name;
        this.amount=amount;
    }
}
class Train extends TicketBooking{
    String seatType;
    public void welcomeMessage(){
        System.out.println("Welcome to Super Fast Train \nName : "+name+"\nAmount : Rs."+amount+"\nSeat Type : "+seatType+"\n");
    }
    //over loading
    public void booking(String name,double amount,String seatType){
        this.name=name;
        this.amount=amount;
        this.seatType=seatType;
    }
}
class Flight extends TicketBooking{
    String acType;
    boolean windowSeat;
    @Override
    public void welcomeMessage(){
        System.out.println("Welcome to Air India service \nName : "+name+"\nAmount : Rs."+amount+"\nAc Type : "+acType+"\nWindow Seat : "+windowSeat+"\n");
    }
    //over loading
    public void booking(String name,double amount,String acType,boolean windowSeat){
        this.name=name;
        this.amount=amount;
        this.acType=acType;
        this.windowSeat=windowSeat;
    }
}