
package com.mycompany.pratical_4;

/**
 *
 * @author chong
 */
public class Student {
  private int studentID;
  private String name;
  private int numQuiz;
  private int totalScore;
  private static double quizContribution;
  
  //consturctor
  public Student(){}
  
  public Student(int studentID, String name){
      this.studentID = studentID;
      this.name = name;
      numQuiz =0;
      totalScore = 0;
  }
  
  //constructor
  
  //Get 
   public int getStudentID() {
        return studentID;
    }
  public String getName(){
      return name;
  }
  public int getNumQuiz(){
      return numQuiz;
  }
  public static double getQuizContribution(){
      return quizContribution;
  }
  //Set
 public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    } 
    public static void setQuizContribution(double quizContribution){
        Student.quizContribution = quizContribution;
    }
    
    //Method
        public void addQuiz(int score){
            
            if(score > 20){
                score = 20;
            }else if(score < 0){
                score=0;
        }else{
                  numQuiz = score;
            }
            numQuiz = score;
                  totalScore = 10 * numQuiz;
        }
        
        public int getTotalScore(){
            return totalScore;
        }
        
        public double getAverageScore(){
            return (double) totalScore / numQuiz;
//            return averageScore;
        }
        
        public void display(){
         System.out.println("-----------------------------------------------------");
          System.out.println("Student ID : " + studentID);
            System.out.println("Student Name : " + name);
              System.out.println("Number of quizzes taken : " + numQuiz);
                System.out.println("Total Score : " + totalScore);
                  System.out.println("Average Score : " + getAverageScore());

        }
            
  



}
  