/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_poe.part3;

// Author - ST10033223 - Christopher Bartie

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Task {

    private String taskName;
    private String taskDescription;
    private String developerName;
    private String taskStatus;
    private String taskID;
    private int taskNumber = 1;
    private int taskDuration;
    private static int choice;
    public int taskAmount;
    private int totalTaskDuration;
    //Creates scanner object
    public static Scanner scan = new Scanner(System.in);
    public String[] taskDevelopers;
    public String[] taskNames;
    public String[] taskIDs;
    public String[] taskDescriptions;
    public String[] taskStatuses;
    public int[] taskDurations;
    public int arrayPosition;
    
    private String displayOutput;

    //Getter for task name
    public String getTaskName() {
        return taskName;
    }

    //Setter for task name
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    //Getter for task description
    public String getTaskDescription() {
        return taskDescription;
    }

    //Setter for task description
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    //Getter for developer name
    public String getTaskDeveloperDetails() {
        return developerName;
    }

    //Setter for developer name
    public void setTaskDeveloperDetails(String taskDeveloperDetails) {
        this.developerName = taskDeveloperDetails;
    }

    //Getter for task status
    public String getTaskStatus() {
        return taskStatus;
    }

    //Setter for task status
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    //Getter for taskID
    public String getTaskID() {
        return taskID;
    }

    //Setter for task ID
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    //Getter for task number
    public int getTaskNumber() {
        return taskNumber;
    }

    //Setter for task number
    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    //Getter for task duration
    public double getTaskDuration() {
        return taskDuration;
    }

    //Setter for task duration
    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    //Setter for total task duration
    public void setTotalTaskDuration(int total) {
        this.totalTaskDuration = total;
    }
    
   public String getDisplayOutput() {
        return displayOutput;
    }
   
    //This method controls the whole functionality of the Kanban board. Running it in turn runs the rest of the methods
    public void startKanban() {
        //Displays the heading
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        System.out.println("Welcome to EasyKanban");

        //Starts the main while loop, where it runs until the user pressed the exit option
        while (true) {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like to do? Press the corresponding number"
                    + "\n 1.) Add Tasks"
                    + "\n 2.) Show Report"
                   // + "\n 3.) Display Done Tasks"
                    + "\n 3.) Display Task with longest duration"
                    + "\n 4.) Search for task with task name"
                    + "\n 5.) Show tasks for specific developer"
                    + "\n 6.) Delete task using task name"
                    + "\n 7.) Quit"));

            //code attribution 
            //this code was taken from stackoverflow
            //https://stackoverflow.com/questions/32018562/using-switch-statements-in-a-while-loop#:~:text=Case%20must%20be%20bigger%20than%204%2C%20in%20your,jumps%20again%20into%20the%20switch%20and%20so%20on.
            //2015
            //This switch statement takes the choice of the user and runs the desired code
            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                    displayLongest();
                    break;
                case 4:
                    String search = JOptionPane.showInputDialog(null, "Input Task Name to search");
                    searchTask(search);
                    break;
                case 5:
                    String developerSearch = JOptionPane.showInputDialog(null, "Input Developer Name to search");
                    showDevelopersTasks(developerSearch);
                    break;
                case 6:
                    String deleteSearch = JOptionPane.showInputDialog(null, "Input Task Name to delete");
                    deleteTask(deleteSearch);
                    break;
                case 7:
                    System.out.println("Closing EasyKanban");
                    System.exit(0);
                    break;

            }
        }
    }

 //Method that runs when the user would like to add a task to their Kanban Board.
    public void addTasks() {
        System.out.println("\nHow many tasks would you like to add?");
        taskAmount = Integer.parseInt(scan.nextLine());
        initArray(taskAmount);
        for (int loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            System.out.println("\nEnter task name");
            taskName = scan.nextLine();
            taskNames[taskNumber - 1] = taskName;
            collectTaskDescription();
            getDeveloperDetails();
            System.out.println("\nEnter duration of the task in hours (Enter only the number)");
            getDuration(Integer.parseInt(scan.nextLine()));
            getStatus();
            createTaskID();
            JOptionPane.showMessageDialog(null, printTaskDetails());
            taskNumber++;

        }

        System.out.println("\nTotal duration for all tasks is " + returnTotalHours() + "hrs");
    } 
    



    
    
    
    
    

    //Method to display the coming soon message when the user selects "Show Report"
    public void showReport() {
        for (int loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            if (taskStatuses[loopCounter].equals("Done")) {
                System.out.println("\nTask Name: " + taskNames[loopCounter]
                        + "\nTask Developer: " + taskDevelopers[loopCounter]
                        + "\nTask Duration: " + taskDurations[loopCounter]);
            }
        }
    }

    //Method to display all the tasks that are completed
    public void displayDone() {
        for (int loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            if (taskStatuses[loopCounter].equals("Done")) {
                System.out.println("\nTask Name: " + taskNames[loopCounter]
                        + "\nTask Developer: " + taskDevelopers[loopCounter]
                        + "\nTask Duration: " + taskDurations[loopCounter]);

            }
        }
    }

  /*//Method to display the task with the longest duration
    public void displayLongest() {
        int longestDuration = 0;
        for (int i = 0; i < taskAmount; i++) {
            if (taskDurations[i] > longestDuration) {
                longestDuration = taskDurations[i];
                arrayPosition = i;
            }
        }
        displayOutput = "\nThe task with the longest duration is:"
                + "\nDeveloper Details: " + taskDevelopers[arrayPosition]
                + "\nTask Duration: " + taskDurations[arrayPosition] + "hrs";
        System.out.println(displayOutput);
    } */
    
    public void displayLongest() {
    int longestDuration = 0;
    for (int i = 0; i < taskAmount; i++) {
        if (taskDurations[i] > longestDuration) {
            longestDuration = taskDurations[i];
            arrayPosition = i;
        }
    }
    displayOutput = "\nThe task with the longest duration is:"
            + "\nDeveloper Details: " + taskDevelopers[arrayPosition]
            + "\nTask Duration: " + taskDurations[arrayPosition] + "hrs";
    System.out.println(displayOutput);
}

          
    //Method to display the task that matches what the user searched for
    public String searchTask(String search) {
        int loopCounter;
        int position = 0;
        for (loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            if (taskNames[loopCounter].equals(search)) {
                System.out.println("\nTask Found:"
                        + "\nTask Name: " + taskNames[loopCounter]
                        + "\nTask Developer: " + taskDevelopers[loopCounter]
                        + "\nTask Status: " + taskStatuses[loopCounter]);
                position = loopCounter;

            }
        }

        return taskDevelopers[position] + ", " + taskNames[position];
    }

    //Method to display the task that matches the developer that the user has searched for
    public String showDevelopersTasks(String search) {
        int loopCounter;
        int position = 0;
        for (loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            if (taskDevelopers[loopCounter].equals(search)) {
                System.out.println("\nThis developer has completed this task:"
                        + "\nTask Name: " + taskNames[loopCounter]
                        + "\nTask Status: " + taskStatuses[loopCounter]);
                position = loopCounter;

            }
        }
        return taskNames[position];
    }

    /*//Method to delete a task
    public String deleteTask(String search) {
        for (int loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
            if (taskNames[loopCounter].equals(search)) {
                taskNames[loopCounter] = "Deleted";
               taskDescriptions[loopCounter] = "Deleted";
                taskDevelopers[loopCounter] = "Deleted";
                taskDurations[loopCounter] = 0;
                taskStatuses[loopCounter] = "Deleted";
                taskIDs[loopCounter] = "Deleted";
                System.out.println("Task Deleted");
                return "Entry " + search + " successfully deleted";
            }
        }
        return null;
    } */
    
    
    
    // Method to delete a task
public String deleteTask(String search) {
    for (int loopCounter = 0; loopCounter < taskAmount; loopCounter++) {
        if (taskNames[loopCounter] != null && taskNames[loopCounter].equals(search)) {
            taskNames[loopCounter] = "Deleted";
            taskDescriptions[loopCounter] = "Deleted";
            taskDevelopers[loopCounter] = "Deleted";
            taskDurations[loopCounter] = 0;
            taskStatuses[loopCounter] = "Deleted";
            taskIDs[loopCounter] = "Deleted";
            System.out.println("Task Deleted");
            return "Entry " + search + " successfully deleted";
        }
    }
    return null;
}


    //Method to validate the task description and return true or false
    public boolean checkTaskDescription() {
        boolean flag;

        //if statement to check the length of the task description 
        if (taskDescription.length() > 50) {
            System.out.println("\nPlease enter a task description of less than 50 characters");
            flag = false;
        } else {
            System.out.println("\nTask successfully captured");
            flag = true;
        }

        return flag; //Flagging true and false statements
    }

    //Method to get the task description and run until the user has entered a valid description of under 50 characters
    public void collectTaskDescription() {
        System.out.println("\nEnter the task description");
        taskDescription = scan.nextLine();
        //While loop that runs until a valid description has been entered
        while (checkTaskDescription() == false) {
            taskDescription = scan.nextLine();
        }
        taskDescriptions[taskNumber - 1] = taskDescription;

    }

    //Method that prints the developer name that the user has input
    public void getDeveloperDetails() {
        System.out.println("\nEnter name and surname of the developer");
        developerName = scan.nextLine();
        taskDevelopers[taskNumber - 1] = developerName;
    }

    //Method that adds the duration of the task to the total hours
    public void getDuration(int hours) {
        taskDuration = hours;
        taskDurations[taskNumber - 1] = taskDuration;
        totalTaskDuration = totalTaskDuration + taskDuration;
    }

    //Method to return the total hours
    public int returnTotalHours() {
        return totalTaskDuration;
    }

    //Method to display the headings and ask the user for the status of the task (to do, done, doing)
    public void getStatus() {
        System.out.println("\nWhat is the status of the task? Press 1, 2 or 3"
                + "\n 1.) To Do"
                + "\n 2.) Done"
                + "\n 3.) Doing");
        int statusChoice = Integer.parseInt(scan.nextLine());

        //Switch statement that will use the users choice and give the status to the "taskStatus"
        switch (statusChoice) {
            case 1: {
                taskStatus = "To Do";
                taskStatuses[taskNumber - 1] = taskStatus;
                break;
            }
            case 2: {
                taskStatus = "Done";
                taskStatuses[taskNumber - 1] = taskStatus;
                break;
            }
            case 3: {
                taskStatus = "Doing";
                taskStatuses[taskNumber - 1] = taskStatus;
                break;
            }
        }
    }

    //This method uses string manipulation to create the taskID, and returns it
    public String createTaskID() {
        //Gets the first 2 letters of the task name and makes it uppercase        
        String firstLetters = (taskName.substring(0, 2).toUpperCase());
        //Splits the full name of the developer and saves the first name to the firstName[] variable

        //code attribution 
        //this code was taken from stackoverflow
        //https://stackoverflow.com/questions/3481828/how-do-i-split-a-string-in-java
        //2016
        String firstName[] = developerName.split(" ");
        //Gets the last 3 letters of the developers first name
        String lastThree = firstName[0].substring(firstName[0].length() - 3).toUpperCase();
        //Combines the letters and task number and creates TaskID
        taskID = firstLetters + ":" + taskNumber + ":" + lastThree;
        taskIDs[taskNumber - 1] = taskID;
        return taskID;
    }

    //Displays all the task details
    public String printTaskDetails() {
        return ("\nTask Name: " + taskName
                + "\nTask Description: " + taskDescription
                + "\nTask Status: " + taskStatus
                + "\nTask Number: " + taskNumber
                + "\nTask ID: " + taskID
                + "\nTask Developer: " + developerName
                + "\nTask Duration: " + taskDuration + " hours");
    }

    //This method initializes the arrays with the amount of space required by the program
    public void initArray(int amount) {
        taskDevelopers = new String[amount];
        taskNames = new String[amount];
        taskIDs = new String[amount];
        taskDescriptions = new String[amount];
        taskStatuses = new String[amount];
        taskDurations = new int[amount];
    }

}//end class

//Reference List
//Oracle. 2022. Arrays, [n.d].[Online]. Available at: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html [Accessed 30 May 2023]
//Stack Overflow. 2015. Using Switch Statements in a While Loop, 14 August 2015.[Online]. Available at: https://stackoverflow.com/questions/32018562/using-switch-statements-in-a-while-loop#:~:text=Case%20must%20be%20bigger%20than%204%2C%20in%20your,jumps%20again%20into%20the%20switch%20and%20so%20on. [Accessed 1 June 2023].
//Stack Overflow. 2016. How do I split a string in java, 23 May 2016.[Online]. Available at: https://stackoverflow.com/questions/3481828/how-do-i-split-a-string-in-java [Accessed 2 June 2023].
