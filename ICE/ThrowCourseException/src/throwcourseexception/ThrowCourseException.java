/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Page 630 question 6
package throwcourseexception;

/**
 *
 * @author chris
 */
public class ThrowCourseException {

    public static void main(String[] args) {
        Course[] course = new Course[6];
        
        try {
            course[0] = new Course("CIS", 101, 5);
            course[1] = new Course("CISuhbh", 9999, 5);
            course[2] = new Course("CID", 1, 5);
            course[3] = new Course("CIS", 101, 0);
            course[4] = new Course("CIF", 101, 5);
            course[5] = new Course("CIJ", 101, 5);

        } catch (CourseException e) {
            System.out.println(e.getMessage());

        }
    }

}//end class
