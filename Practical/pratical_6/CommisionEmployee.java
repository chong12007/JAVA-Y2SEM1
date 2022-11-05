
package com.mycompany.pratical_6;


public class CommisionEmployee extends Employee {
    private double grossSale;
    private double  commRate;

    public CommisionEmployee() {}

    public CommisionEmployee(String name, int yearJoined, double basicSalary,
            double grossSale, double commRate) {
        super(name,yearJoined,basicSalary);
        this.grossSale = grossSale;
        this.commRate = commRate;
    }
    
    //Getter

    public double getGrossSale() {
        return this.grossSale;
    }

    public double getCommRate() {
        return this.commRate;
    }
    //Getter end
    
    //Setter

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public void setCommRate(double commRate) {
        this.commRate = commRate;
    }
    //Setter ebd

public String toString(){
    return super.toString() +
            "\nGross Sale : " + this.grossSale +
            "\nCommission Rate : " + this.commRate;
}    

public double calculateSalary(){
    return super.getBasicSalary() + this.grossSale * this.commRate;
}
    
    public boolean equals(Object o){
        if(o instanceof CommisionEmployee){
            return super.equals(o);
        }else{
            return false;
        }
    }


}
