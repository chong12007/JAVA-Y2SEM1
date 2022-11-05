/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pratical_2;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author chong
 */
public class Pratical_2 {
    

    public static void main(String[] args) {
        Pratical_2 m = new Pratical_2();
//        m.Q1();
//        m.Q3();
    }
    
    public void Q1(){
        System.out.println("Number   SquareRoot");
        for(int i=0; i <21; i=i+2){
            double sqrt = Math.sqrt (i);
            System.out.printf("%2d       %.4f\n", i, sqrt);
        }
    }
    
    //Q3=======================================================
    public void Q3(){
            System.out.println("Inches      Centimeters             Centimeters         Inches");
            for(double i=1; i< 11; i++){
            double  j= (i*4) + i;
            double centimeters = inchToCentimeter(i);
            double inches = centimeterToInch( j );
       
                System.out.printf("%-4.1f        %-5.2f                   %-4.1f                %-4.2f \n", i, centimeters, j, inches);
            }
    }
    
    public static double inchToCentimeter(double in){
        return in * 2.54;
    }
    
    public static double centimeterToInch(double cm){
        return cm / 2.54;
    }
    //Q3============================================================================
    
    
    
}
