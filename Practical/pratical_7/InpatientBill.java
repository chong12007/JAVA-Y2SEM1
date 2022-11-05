
package com.mycompany.pratical_7;

public class InpatientBill extends PatientBill{
    private static double standardRoom = 100.00;
    private static double privateRoom = 200.00;
    private double specialistCharges;
    private double labCharges;
    private char roomType;
    private int durationOfStay;
    
    public InpatientBill(String name, double specialistCharges, 
            double labCharges, char roomType, int stay)
    {
        super(name);
        this.specialistCharges =  specialistCharges;
        this.labCharges = labCharges;
        this.roomType = roomType;
        this.durationOfStay = stay;
        
        
    }
    
    public double calTotal(){
        double roomCharges = 0.0;
        switch(roomType){
            case 'S' : roomCharges = this.durationOfStay * InpatientBill.standardRoom;
                        break;
            case 'P' : roomCharges = this.durationOfStay * InpatientBill.privateRoom;
                        break;    
        }//end switch
                        
           return this.specialistCharges + this.labCharges + roomCharges;
        }
    }