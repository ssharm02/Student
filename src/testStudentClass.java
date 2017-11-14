/*
 * Course: PROG10082, Section 10082-63753
 * Sarthak Sharma, 030202551
 * Summary:
 */

/**
 *
 * @author SarthaksComp
 */
public class testStudentClass {
    
    //ecapsulated variables
    private String firstName = "";
    private String lastName = "";
    private int ID = 0;
    private int grade = 0;
    
    //empty constructor
    public testStudentClass() { }
    
    //constructor with arguments
    /**
     * 
     * @param firstName
     * @param lastName
     * @param ID
     * @param grade
     * @throws BadGradeException2 
     */
    public testStudentClass (String firstName, String lastName, int ID, int grade) throws BadGradeException2  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ID = 0;
    this.grade = 0;
    
    if (grade < 0 || grade > 100) {
        
        throw new BadGradeException2();
        
    }
    
    }
    //get first name
    public String getfirstName() {
        return firstName;
    }
    //set first name
    public void setfirstName(String firstName) {
    }
    public String getlastName () {
        return lastName;
    }
    public void setlastName(String lastName) {
    }
    public int getID () {
        return ID;
    }
    public void setID (int ID){
        
    }
    public int getgrade () {
        return grade;
    }
    public void setgrade (int grade) throws BadGradeException2{
        this.grade = grade;
        if (grade < 0 || grade > 100) {
            throw new BadGradeException2();
        }
    }
    @Override
  public String toString(){
    return ID+","+lastName+","+firstName+","+grade
      +","+calculateLetterGrade();
  }
    public String calculateLetterGrade() {
        if (grade >= 90 && grade <=100) {
            return "A+";
        }
        else if (grade >= 80 && grade <= 89) {
            return "A";
        }
        else if (grade >= 75 && grade <=79) {
            return "B+";
        }
        else if (grade >= 70 && grade <= 74) {
            return "B";
        }
        else if (grade >= 65 && grade <= 69) {
            return "C+";
        }
        else if (grade >= 60 && grade <= 64) {
            return "C";
        }
        else if (grade >= 50 && grade <= 59) {
            return "D";
        }
        else {
            return "F";
        }
       
    }
}
