
package com.mycompany.pratical_7;


public class Pratical_7 {
public static void main(String[] args) {
        
        PatientBill[] bills = new PatientBill[4];
        bills[0] = new OutpatientBill("Zul", 100);
        bills[1] = new InpatientBill("Ali", 50, 100, 'S', 5);
        bills[2] = new InpatientBill("Jack", 200, 400, 'P', 2);
        bills[3] = new OutpatientBill("Mary", 50);
        
        System.out.println("Orginal Array");
        for (int i = 0; i < bills.length; i++) {
            System.out.println(bills[i]);
            System.out.println("Total Charges : " + bills[i].calTotal());
            
        }
        
        System.out.println("\nSum all bills : " + computeTotalCollection(bills));
        
        System.out.println("\nSort Result : ");
        
        bills = selectionSort(bills);
        
         for (int i = 0; i < bills.length; i++) {
       
            System.out.println(bills[i]);
             System.out.println("Total Charges : " + bills[i].calTotal());

            
        }
    }//end main
    
    public static double computeTotalCollection(PatientBill[] billArr){
        double total = 0.0;
        
        for (int i = 0; i < billArr.length; i++) {
            total += billArr[i].calTotal();
        }
        return total;
    }
    
    public static PatientBill[] selectionSort(PatientBill[] arr){
        for (int i = 0; i < arr.length; i++) {
           int indexOfSmallest = i;
            for (int j = i+1; j < arr.length; j++) {
               if(arr[j].compareTo(arr[indexOfSmallest]) < 0){
                   indexOfSmallest = j;
               }//end if          
            }//end for j
            PatientBill tempArr = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = tempArr;    
        }//end for i
        return arr;
    }
}

