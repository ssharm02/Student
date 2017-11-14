package Assignment1_Sarthak_Sharma;

/**
 * 
 * Sarthak Sharma
 * PROG24178 JAVA 2 Professor Johnathan Penava 
 * Summary: Student Class for Assignment 1
 * OOP Java 2
 * The student class contains methods various methods that get student information and 
 * return a letter grade based on the input a student provides
 * Had to make two constructors, unable to use the constructor with arguments in main class, caused errors & confusion.  
 */

/**
 *
 * @author SarthaksComp
 */
public class Student {
    //encapsulated variables
    private String firstName = "";
    private String lastName = "";
    private int ID = 0;
    private int grade = 0;
    

    //Student constructor without arguments
    public Student () {}
    
    /**
 * 
 * @param firstName
 * @param lastName
 * @param ID
 * @param grade
 * @throws BadGradeException - if the grade is less than 0 or greater than 100, a bad grade exception is thrown
 */
       Student(String firstName, String lastName, int ID, int grade) throws BadGradeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.grade = grade;
        
        if (grade < 0 || grade > 100) {
            
            throw new BadGradeException();
        }            
    }   
  /**
   * 
   * @returns the firstName entered by the user via getter 
   * //getter returns firstName
   */  
    public String getFirstName(){
        
        return firstName;
    }
    /**
     * 
     * @param firstName 
     * //sets firstName as parameter
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * 
     * @return lastName entered by the user
     * getters return last name
     */
    public String getlastName(){
        
        return lastName;
    }
    /**
     * 
     * @param lastName 
     */
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    /**
     * 
     * @return ID
     */
    public int getID(){
        
        return ID;
    }
    /**
     * 
     * @param ID 
     */
    public void setID(int ID){
        this.ID = ID;
    }
    /**
     * 
     * @return grade
     */
    public int getgrade(){
        
        return grade;
    }
    /**
     * 
     * @param grade
     * @throws BadGradeException 
     * if grades are great than 100 or less than 0, BadGradeException is thrown
     */
    public void setgrade(int grade) throws BadGradeException {
        this.grade = grade;
        if (grade < 0 || grade > 100) {
        throw new BadGradeException ();
        }
    }
    /**
     * 
     * @return  prints information entered by the user in String
     * 
     */
   @Override
  public String toString(){
    return ID+","+lastName+","+firstName+","+grade
      +","+calculateLetterGrade();
  }
    /**
     * This method returns a Letter grade based on the int grade entered by the user
     * @return Letter grade
     */
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
