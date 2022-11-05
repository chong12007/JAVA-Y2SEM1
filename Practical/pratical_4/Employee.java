
 package com.mycompany.pratical_4;

/**
 *
 * @author chong
 */
public class Employee {
      private String name;
      private double salary;
   
      //Constructor======================================  
    Employee(){
        name = "";
        salary = 0;
    }
    
    Employee(String employeeName){
        this.name = employeeName;
        salary = 0;
        }
    
    Employee(String employeeName, double currentSalary){
        name= employeeName;
        salary = currentSalary;
        }
      //Constructor======================================
    
    
    
     //Get Set========================================
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    //Get Set============================================
    
    //Method==================================================
    
         void raiseSalary(double percent){
        salary = salary + (salary * percent/100.0);
        }
    
         public void showBeforeRaise(){
            System.out.printf("%s   Salary before raise = RM%.2f\n", name,  salary);
        }
    
         public void showAfterRaise(){
            System.out.printf("%s   Salary after raise  = RM%.2f\n", name,  salary);
               System.out.println("-------------------------------------------------------------");
          }    
}
