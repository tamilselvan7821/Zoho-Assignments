package travel.user;
import travel.booking.*;
public class User{
    int userId;
    String userName;
    Ticket ts;
    public void bookTicket(Ticket ts){
        this.ts=ts;
    }
    public User(int userId,String userName){
        this.userId=userId;
        this.userName=userName;
    }
    @Override
    public String toString() {
        return "userId : "+userId+"\nuserName : "+userName+"\nTicket details : "+ts+"\n";
    }

}