import java.util.Scanner;

/*
 * Course: PROG10082, Section 10082-63753
 * Sarthak Sharma, 030202551
 * Summary:
 */

/**
 *
 * @author SarthaksComp
 */
public class testStudentMain {
    public static void main (String [] args) throws BadGradeException2 {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of students ");
        int numberOfStudents = input.nextInt();
        testStudentClass [] s = new testStudentClass[numberOfStudents];
        input.nextLine();
        
        for (int i = 0; i < s.length; i++) {
            System.out.println("Please enter the information for " + (1+i) + " of " + numberOfStudents);
        
        String test = input.nextLine();
        String [] parts = test.split(",");
        s[i] = new testStudentClass();
        
        try 
        {
            s[i].setfirstName(parts[0].trim());
            s[i].setlastName(parts[1].trim());
            s[i].setID(Integer.parseInt(parts[2].trim()));
            s[i].setgrade(Integer.parseInt(parts[3].trim()));
            
        }
        catch (BadGradeException2 bge2) 
        {
            s[i].setgrade(0);
        
        }
     //for loop ends   
    }
        System.out.println("The calculated grades are ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
}
}
