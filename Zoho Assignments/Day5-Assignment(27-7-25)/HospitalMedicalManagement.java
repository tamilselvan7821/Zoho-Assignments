/*
Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class HospitalMedicalManagement{
    public static void main(String[] args) {
        //fill In patient records
        System.out.println("Inpatient Record : ");
        InPatientRecord tamil=new InPatientRecord(123,10,50);
        LocalDate tamilVisitDate=LocalDate.now();
        tamil.inputRecordDetails(1,"tamil selvan",tamilVisitDate,"Fever");
        tamil.displayRecord();

        //fill out patient records
        try{
            System.out.println("out patient record : ");
            Date tamilOutDate=new SimpleDateFormat("dd-MM-yyyy").parse("14-07-2025");
            OutPatientRecord tamilOut=new OutPatientRecord("Kumar",200,tamilOutDate);
            tamilOut.inputRecordDetails(1,"tamil selvan",tamilVisitDate,"Fever");
            tamilOut.displayRecord();
        }
        catch(ParseException e){
            System.out.println("Invalid date format....");
        }
    }
}
class MedicalRecord{
    int recordId;
    String patientName;
    LocalDate dateOfVisit;
    String diagnosis;
    public void inputRecordDetails(int recordId,String patientName,LocalDate dateOfVisit,String diagnosis){
        this.recordId=recordId;
        this.patientName=patientName;
        this.dateOfVisit=dateOfVisit;
        this.diagnosis=diagnosis;
    }
    public void displayRecord(){

    }
}
class InPatientRecord extends MedicalRecord{
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;
    double totalCharge;
    public InPatientRecord(int roomNumber,int numberOfDaysAdmitted,double roomCharges){
        this.roomNumber=roomNumber;
        this.numberOfDaysAdmitted=numberOfDaysAdmitted;
        this.roomCharges=roomCharges;
        calculateTotalCharges();
    }
    public void calculateTotalCharges(){
        totalCharge=numberOfDaysAdmitted*roomCharges;
    }
    @Override
    public void displayRecord(){
        System.out.println("pateient Id : "+recordId+"\nPateient Name : "+patientName+"\nDate of visit : "+dateOfVisit+"\ndiagnosis : "+diagnosis+"\nRoom no : "+roomNumber+"\nno of days admitted : "+numberOfDaysAdmitted+"days\nRoom charges : Rs. "+roomCharges+"\nTotal charge : Rs. "+totalCharge+"\n");
    }
}
class OutPatientRecord extends MedicalRecord{
   String doctorName;
   double consultationFees;
   Date outDate;

    public OutPatientRecord(String doctorName,double consultationFees,Date outDate) {
        this.doctorName=doctorName;
        this.consultationFees=consultationFees;
        this.outDate=outDate;
    }
    @Override
    public void displayRecord(){
        System.out.println("pateient Id : "+recordId+"\nPateient Name : "+patientName+"\nDate of visit : "+dateOfVisit+"\ndiagnosis : "+diagnosis+"\nDoctor name : "+doctorName+"\nDoctor fees : "+consultationFees+"\nDate of out : "+outDate+"\n");
    }
}
