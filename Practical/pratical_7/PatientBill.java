
package com.mycompany.pratical_7;

public abstract class PatientBill implements Comparable {
    protected int visitID;
    protected String name;
    
    private static int lastAssignID = 1001;

    public PatientBill() { }

    public PatientBill(String name) {
        this.name = name;
        this.visitID =   PatientBill.lastAssignID;
        PatientBill.lastAssignID++;
         
    }
    
    public String toString(){
        return "\nPateint Name : " + this.name +
                    "\nVisit ID : " + this.visitID;
                
    }
    
    public abstract double calTotal();
    
    public int compareTo(Object o){
        PatientBill otherBill = (PatientBill)o;
        return this.name.compareTo(otherBill.name);
    }
    
    
}