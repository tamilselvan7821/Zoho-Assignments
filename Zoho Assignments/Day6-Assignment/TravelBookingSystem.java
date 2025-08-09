/*
Design a travel booking system using two packages:
 travel.booking – includes a class Ticket with ticket ID, destination, and fare.
 travel.user – includes a class User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
*/
import travel.booking.Ticket;
import travel.user.User;
public class TravelBookingSystem{
    public static void main(String[] args) {
        User user1=new User(12,"tamil");
        user1.bookTicket(new Ticket(5,"surandai",50));
        System.out.println(user1);
    }
}