
package com.mycompany.pratical_6;

public class Clerk extends  Employee{
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate = 0.5;

    public Clerk() {}

    public Clerk(String name, int yearJoined, double basicSalary,
            double allowance, int overtimeHours) {
        super(name,yearJoined,basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        
    
    }
    
    //getter

    public double getAllowance() {
        return this.allowance;
    }

    public int getOvertimeHours() {
        return this.overtimeHours;
    }

    public static double getOvertimeRate(){
        return Clerk.overtimeRate;
    }
    
    //getter end
    
    //setter 

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

   public static void setOvertimeRate(double overtimeRate){
       Clerk.overtimeRate = overtimeRate;
   }
    //setter end
    
   public String toString(){
    return super.toString() +
            "\nAllowance : " + this.allowance +
            "\nOvertime Hours : " + this.overtimeHours +
            "\nOvertime Rate : " + this.overtimeRate;
            }
   
  
   public double calculateSalary(){
       return super.getBasicSalary() + this.allowance + 
               (overtimeHours * overtimeRate);
   }
    
 
    
}