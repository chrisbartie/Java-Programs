/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwcourseexception;

/**
 *
 * @author chris
 */
public class Course {

    private String Department;
    private int CourseNumber;
    private double Credits;

    public Course(String department, int courseNumber, double credits) throws CourseException {
        setDepartment(department);
        setCourseNumber(courseNumber);
        setCredits(credits);
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) throws CourseException {
        if (Department.length() != 3) {
            throw new CourseException(Department);
        }
        this.Department = Department;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public void setCourseNumber(int CourseNumber) throws CourseException {
        if (CourseNumber < 100 || CourseNumber > 499) {
            throw new CourseException(CourseNumber);
        }
        this.CourseNumber = CourseNumber;
    }

    public double getCredits() {
        return Credits;
    }

    public void setCredits(double Credits) throws CourseException {
        if (Credits < 0.5 || Credits > 6) {
            throw new CourseException(Credits);
        }
    }

}//end class
