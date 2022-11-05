/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratical_4;

/**
 *
 * @author chong
 */
public class Q1 {
    
 

        public void Q1(){
            ;
     
       Employee e1 = new Employee("Alice", 1000);
       //raise Salary 8%
       e1.showBeforeRaise();
       e1.raiseSalary(8);
       e1.showAfterRaise();
       
       //No input constuctor
       Employee e2 = new Employee();
       e2.showBeforeRaise();
       
       
       Employee e3 = new Employee("Chucky");
       e3.setSalary(3500.0);
       e3.showBeforeRaise();
       e3.raiseSalary(8);
       e3.showAfterRaise();
       
       //Compare to get higher salary
       if(e1.getSalary() > e3.getSalary()){
           System.out.printf("%s have more salary than %s \n", e1.getName(), e3.getName());
       }else{
            System.out.printf("%s have more salary than %s\n", e3.getName(), e1.getName());
       }
       
       //Total salary;
       double total = e1.getSalary() + e3.getSalary();
       System.out.printf("Total salary of %s and %s is RM%.2f", e1.getName(), e3.getName(), total);
         }
}//end
