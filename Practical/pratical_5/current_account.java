
package com.mycompany.pratical_5;

import java.util.Scanner;


public class current_account extends Account {
    Scanner sc = new Scanner(System.in);
   
    
    

    public current_account() {
        System.out.println("Enter account num : ");
    int accountNum = sc.nextInt();
    System.out.println("Enter balance : ");
    double balance = sc.nextDouble();
    }
    
 
}
