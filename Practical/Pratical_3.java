/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pratical_3;
import java.util.Scanner;

/**
 *
 * @author chong
 */
public class Pratical_3 {

    public static void main(String[] args) {
         Pratical_3 m = new Pratical_3();
//        m.Q1();
//        m.Q2();
            m.Q3();
    }
    
    public void Q1(){
      System.out.print("Enter number of quiz scores to process : ");
      Scanner sc = new Scanner(System.in);
      int numQuiz = sc.nextInt();
  
      int [] arr= new int [numQuiz];
      int total=0;
      double avg=0;
      int count_above=0;
      int count_below=0;
      
      //input score
      for(int i=0; i<arr.length; i++){
          System.out.printf("Score %d :  ", i+1);
          arr[i] = sc.nextInt();
          total += arr[i];
          avg = (double)total / (i+1);
      }
      
      //check equal and below
      for(int i=0; i<arr.length; i++){
          if(arr[i] < avg){
              count_below++;
          }else{
              count_above++;
          }
      }
      
      //result
      System.out.println("Results");
      System.out.println("=======");
      System.out.printf("Average is %.2f", avg);
      System.out.println("Number of scores above or equal to the average is " + count_above);
      System.out.println("Number of scores below the average is " + count_below);
    }
    
    //Q2======================================
    public void Q2(){
        int [] list ={1,2,4,5,10,100,2,-22};
       int small= returnSmallest(list);
       System.out.println(small);
    }
    
    public int returnSmallest(int [] list){
        int smallest = list[0];
        for(int i=1; i< list.length; i++){
            if(list[i] < smallest){
                smallest = list[i];
            }
        }
        return smallest;
    }
    //Q2============================================
    
    public void Q3(){
        System.out.println("Denomination(RM)        Quantity        Value(RM)");
        int [] deno = {100, 50, 20, 10, 5, 1};
        int [] qty = {26, 87, 96, 0, 33, 145};
        int [] value = new int [deno.length];
        int total=0;
      
        for(int i=0; i<deno.length; i++){
            value[i] = deno[i] * qty[i];
             total += value[i];
             if(qty[i] == 0){
                continue;
            }
            System.out.printf("           %4d             %4d            %4d\n", deno[i], qty[i], value[i]);
    }
        System.out.println("Total = RM " + total);
    
   }
}
