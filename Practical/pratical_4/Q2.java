/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratical_4;

/**
 *
 * @author chong
 */
public class Q2 {
    
    public void Q2(){
    
    Student.setQuizContribution(20.0);
    Student s1 = new Student(1001, "Alice");
    //Maximum 20 quiz
    s1.addQuiz(19);
    s1.display();
    
    //Q3
    System.out.print("Total mark out of " + Student.getQuizContribution() + "% for Coursework Mark = " );
    System.out.println(s1.getTotalScore() / Student.getQuizContribution() * 10 );
    
//    Student s2 = new Student(1002, "Becky");
//    s2.addQuiz(-21);
//    s2.display();
//    
//    System.out.print("Total mark out of " + Student.getQuizContribution() + "% for Coursework Mark = " );
//    System.out.println(s2.getTotalScore() / Student.getQuizContribution() * 10 );
    
    }
}
