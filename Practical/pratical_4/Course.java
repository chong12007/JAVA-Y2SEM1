
package com.mycompany.pratical_4;

public class Course{
    
    String courseTitle;
    double feesPerStudent;
    int noOfStudent;
    String [] studentNames;
    int courseCount;
    
    //Constructor
    
    public Course(){}
    
    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        studentNames = new String [100];
        courseCount++;
    }
    
   //Set
   public void setCourseTitle(String courseTitle){
       this.courseTitle = courseTitle ;
   }
   public void setFeesPerStudent(double feesPerStudent ){
       this.feesPerStudent = feesPerStudent ;
   }
   //Get
  public String getCourseTitle(){
      return this.courseTitle;
  }
  public double getFeesPerStudent(){
      return this.feesPerStudent;
  }
    //Method
        public double calcFeesCollected(){
            return feesPerStudent * noOfStudent;
        }
        
        public void addStudent(String studName){
           studentNames[noOfStudent] = studName;
           noOfStudent++;
        }
        //get
        public String[] getStudentNames(){
            return studentNames;
        }
        
        public int getNoOfStudent(){
            return noOfStudent;
        }
        
        public String toString(){//overriding the toString() method  
        return  "Course Title : " + courseTitle + "\nNumber of Student enrolled : "+ noOfStudent + "\nFees Per Student : RM" + feesPerStudent
        + "\nTotal Fees Collected : RM" + calcFeesCollected();  
        }  
        
        
            
}//end
        
        
        
       
    
    
    
    
