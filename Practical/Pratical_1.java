
package com.mycompany.pratical_1;
import java.util.Scanner;


public class Pratical_1 {
    

//Main program
    //=====================================
    public static void main(String[] args) {
        

       Pratical_1 m = new Pratical_1();
//       m.Q1();
//       m.Q2();
//         m.Q3();
          
    }
    //======================================
    
    //=============================================
    public  void Q1 () {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter name : ");
      String name = sc.nextLine();
      System.out.print("Enter your year of study : ");
      int yearOfStudy = sc.nextInt();
      System.out.print("Enter What is your target GPA for this semester?  : ");
      double targetGPA = sc.nextDouble();
      
      //Result================================
        System.out.println("Welcome " + name + '!');
        System.out.println("Work hard to achieve your target GPA of " + targetGPA + " this semester of your Year " + yearOfStudy + ".");
    //==============================================
    }
    //===================================================================
    
    public void Q2(){
      System.out.println("=====================Configuration: <Default>===================");
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age (years) : ");
      int age = sc.nextInt();
   
      int age_year = age;
      int age_day = age*365;
      int age_second = age*365*24*60*60;
      
        System.out.println("Age in years : "  + age_year + " years");
        System.out.println("Age in days : "  + age_day + " days");
        System.out.println("Age in seconds: "  + age_second + " seconds");
        System.out.println("Process completed");
    }
    
    public void Q3(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your credit card number : ");
          int cardNum = sc.nextInt();
          
          int _1st = cardNum /10000000 %10;
          int _2nd = cardNum /1000000 %10;
          int _3rd = cardNum /100000 %10;
          int _4th = cardNum /10000 %10;
          int _5th = cardNum /1000 %10;
          int _6th = cardNum /100 %10;
          int _7th = cardNum /10 %10;
          int _8th = cardNum  %10;
          
          int rightmost_digit = _8th + _6th + _4th + _2nd;
          int leftmost_digit = _7th + _5th + _3rd + _1st;
          
          int total = rightmost_digit + leftmost_digit;
          boolean valid;
          
             
          if(total == 50){
              System.out.println("The credit card number is valid");
              valid=true;
    }else{
                 System.out.println("The credit card number is not valid");
              valid=false;
          }
}

}
