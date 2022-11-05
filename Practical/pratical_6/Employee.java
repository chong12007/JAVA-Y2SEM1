
package com.mycompany.pratical_6;


public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;

    public Employee() {}

    public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public int getYearJoined() {
        return this.yearJoined;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }
    //Getter end
    
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    //Setter end
    
    public String toString(){
        return "\nName : " + this.name +
                "\nYeat Joined : " + this.yearJoined +
                "\nBasic Salary : " + this.basicSalary;
    }
    
    public double calculateSalary(){
        return this.basicSalary;
    }
    
    public boolean equals(Object o){
        if(o instanceof Employee){
            return name.equals(((Employee)o).name);
        }else{
            return false;
        }
    }
    
}