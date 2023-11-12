/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwcourseexception;

/**
 *
 * @author chris
 */
public class CourseException extends Exception {

    public CourseException(String department) {
        super("Invalid Department: " + department);
    }

    public CourseException(int courseNumber) {
        super("Invalid Course Number: " + courseNumber);

    }

    public CourseException(double credits) {
        super("Invalid Credits: " + credits);

    }

}//end class
