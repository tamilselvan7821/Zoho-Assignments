package travel.booking;
public class Ticket{
    int ticketID;
    String destination;
    double fare;
    public Ticket(int ticketID,String destination,double fare){
        this.ticketID=ticketID;
        this.destination=destination;
        this.fare=fare;
    }

    @Override
    public String toString() {
        return "ticketID : "+ticketID+", destination : "+destination+", fare : "+fare;
    }
    
}