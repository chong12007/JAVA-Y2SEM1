
package com.mycompany.pratical_7;

public class OutpatientBill extends PatientBill{
    private static double registrationFees = 30.0;
    private double consultationFees;

    public OutpatientBill(String name,double consultationFees) {
        super(name);
        this.consultationFees = consultationFees;
    }
    
    public  double calTotal(){
        return OutpatientBill.registrationFees + this.consultationFees;
    }
}
