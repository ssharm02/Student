package Assignment1_Sarthak_Sharma;

import java.util.Scanner;
/*
 * By Sarthak Sharma
 * PROG24178 JAVA 2 Professor Johnathan Penava 
 * Summary: Main Class for Assignment 1
 * Main method that calls on the student object and asks the user to input student information.
 * Information is stored in an array and all bad exceptions are thrown. A letter grade is retuden along with the grade
 *
 *All illegal arguments are thrown away by implementing try catch exception handling
 */

/**
 *
 * @author SarthaksComp
 */

public class StudentMain {
    public static void main (String [] args) throws BadGradeException {
    Scanner scanner = new Scanner(System.in);
  
        
        //user enters the number of students
        System.out.println("Enter the number of students in class: ");
        int numberOfStudents = scanner.nextInt();
        //a new student object is created and its size is defined by the numberOfStudents
        Student [] s = new Student[numberOfStudents];
        scanner.nextLine();
        
        //loop and ask the user for all the info       
        for (int i = 0; i < s.length; i++) {
        System.out.println("Please enter the informaton for Student " + (i+1) + " of " + numberOfStudents);
        
        String test = scanner.nextLine();
       
       
       // split the test string using the split method
        String [] parts = test.split(",");
        s[i]= new Student();
        try 
        {
            
        s[i].setFirstName(parts[0].trim());
        s[i].setlastName(parts[1].trim());
        s[i].setID(Integer.parseInt(parts[2].trim()));
        s[i].setgrade(Integer.parseInt(parts[3].trim()));
                
        }

        catch (BadGradeException be)
               {
                   s[i].setgrade(0);
               }
        catch (NullPointerException npe) 
                {
                    System.out.println("You have entered an invalid input");
                }
        catch (Exception ex)
                {
                     System.out.println("You have entered bad input");
                }
        }
        //Print all the information collected by the user, in the proper format
        System.out.println("The calculated grades are:");
            for(int i = 0; i< s.length; i++) {
                System.out.println(s[i]);
            }

  
    }
}
