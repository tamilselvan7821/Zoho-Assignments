

/*
Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data
members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide
appropriate public getter and setter methods to access and modify these details securely. Also include a method to
display the transaction summary.]
*/
public class PaymentGateWaySystem{
    public static void transactionSummary(Sbi sbi){
        System.out.println("TransactionId : "+sbi.getTransactionId()+"\nPayer Name : "+sbi.getPayerName()+"\nPayee Name : "+sbi.getPayeeName()+"\nAmount : "+sbi.getAmount()+"\nPayment Method : "+sbi.getPaymentMethod()+"\nPayment status : "+sbi.getPaymentStatus()+"\n");
    }
    public static void main(String[] args) {
        //create transaction
        Sbi sbi=new Sbi();
        sbi.setTransactionId(123);
        sbi.setPayeeName("kumar");
        sbi.setPayerName("Tamil selvan");
        sbi.setAmount(10000);
        sbi.setPaymentMethod("Deposit");
        sbi.setPaymentStatus("paid");
        //print details
        transactionSummary(sbi);
    }
}
class Sbi{
    private int transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    public void setTransactionId(int transactionId){
        this.transactionId=transactionId;
    }
    public void setPayerName(String payerName){
        this.payerName=payerName;
    }
    public void setPayeeName(String payeeName){
        this.payeeName=payeeName;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    public int getTransactionId() {
        return transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public double getAmount() {
        return amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}