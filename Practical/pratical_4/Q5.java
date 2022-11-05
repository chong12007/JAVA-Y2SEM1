
 package com.mycompany.pratical_4;

/**
 *
 * @author chong
 */
public class Q5 {
    
    public void Q5(){
        
      Course c1 = new Course("DFT", 18000);
      c1.addStudent("HF");
      c1.addStudent("YH");
      
      System.out.println(c1);//compiler writes here s1.toString()  
      System.out.println("-----------------------------------------");
      
      
      //Q5 b
      Course c2 = new Course("Introduction to Computers", 250);
      c2.addStudent("Ali Said");
      c2.addStudent("Wong Ken");
      c2.addStudent("Peter Lim");
      
    System.out.println(c2);//compiler writes here s1.toString()
    System.out.println("-----------------------------------------");
    System.out.println("Student who enrolled for " + c2.getCourseTitle() + ":");
    
    String[] studentNames =c2.getStudentNames();
    for (int i=0; i< c2.getNoOfStudent(); i++){
        System.out.println( i+1 + "." + studentNames[i]);
        }
    }
    
}//end
