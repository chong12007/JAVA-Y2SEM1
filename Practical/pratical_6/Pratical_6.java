

package com.mycompany.pratical_6;


public class Pratical_6 {

   public static void main(String[] args) {
       Employee [] empArray = new Employee[3];
       
       empArray[0] = new Employee("Ali", 2008, 2500 );
       empArray[1] = new CommisionEmployee("Ali", 2010, 2000, 1000, 0.2);
       
       empArray[2] = new Clerk("Alibaba", 2020, 1500, 200.0, 3);
        printElement(empArray);
        
     
        System.out.println("Testing equals : " + empArray[0].equals(empArray[1]));
    }
    
    
    public static void printElement(Employee[] eArray){
        
        for (int i = 0; i < eArray.length; i++) {
          if(eArray[i] instanceof CommisionEmployee){
               System.out.println("=================");
              System.out.println("Commision Employee");
          }else if(eArray[i] instanceof Clerk){
               System.out.println("=================");
              System.out.println("Clerk");
          }else{
             System.out.println("=================");
              System.out.println("Employee");
             
          }
           
             System.out.println("=================");
            System.out.println(eArray[i].toString());
            System.out.println("Final Salary : " + eArray[i].calculateSalary());
            System.out.println("");
        }
    }
}
