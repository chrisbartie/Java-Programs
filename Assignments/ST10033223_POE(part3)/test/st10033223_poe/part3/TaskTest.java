/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10033223_poe.part3;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author chris
 */
public class TaskTest {

    @Test
    public void testDeveloperArray() {
        String[] developers = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberholzer"};

        Assert.assertEquals("Mike Smith", developers[0]);
        Assert.assertEquals("Edward Harrington", developers[1]);
        Assert.assertEquals("Samantha Paulson", developers[2]);
        Assert.assertEquals("Glenda Oberholzer", developers[3]);
    }

    /*@Test
    public void displayLongest() {
        TaskManager taskManager = new TaskManager();

        // Set up test data
        Task.addTasks("Task 1", "Mike Smith", 8);
        taskManager.addTasks("Task 2", "Edward Harrington", 10);
        taskManager.addTasks("Task 3", "Samantha Paulson", 7);
        taskManager.addTasks("Task 4", "Glenda Oberholzer", 11);

        // Call the method under test
        String result = taskManager.displayLongest();

        // Assert the result
        Assert.assertEquals("Glenda Oberholzer, 11", result);
    } */
    
    
@Test
public void testDisplayLongest() {
    // Create an instance of the Task class
    Task task = new Task();

    // Set up the test data
    task.taskNames = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
    task.taskDevelopers = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
    task.taskDurations = new int[]{5, 8, 2, 11};
    task.taskStatuses = new String[]{"To Do", "Doing", "Done", "To Do"};
    task.taskAmount = 4;

    // Call the displayLongest() method
    task.displayLongest();

    // Check if the displayOutput matches the expected result
    String expectedOutput = "The task with the longest duration is:\nDeveloper Details: Glenda Oberholzer\nTask Duration: 11hrs";
    Assert.assertEquals(expectedOutput.trim(), task.getDisplayOutput().trim());
}


@Test
public void testSearchTask() {
    // Create an instance of the Task class
    Task task = new Task();

    // Set up the test data
    task.taskNames = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
    task.taskDevelopers = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
    task.taskDurations = new int[]{5, 8, 2, 11};
    task.taskStatuses = new String[]{"To Do", "Doing", "Done", "To Do"};
    task.taskAmount = 4;

    // Call the searchTask() method
    String result = task.searchTask("Create Login");

    // Check if the result matches the expected output
    String expectedOutput = "Mike Smith, Create Login";
    Assert.assertEquals(expectedOutput, result);
}

@Test
public void testSearchTasksByDeveloper() {
    // Create an instance of the Task class
    Task task = new Task();

    // Set up the test data
    task.taskNames = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
    task.taskDevelopers = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
    task.taskDurations = new int[]{5, 8, 2, 11};
    task.taskStatuses = new String[]{"To Do", "Doing", "Done", "To Do"};
    task.taskAmount = 4;

    // Call the showDevelopersTasks() method with the developer name
    String result = task.showDevelopersTasks("Samantha Paulson");

    // Check if the result matches the expected output
    String expectedOutput = "Create Reports";
    Assert.assertEquals(expectedOutput, result);
}

   private Task task;

    @Before
    public void setUp() {
        task = new Task();
    }
   @Test
    public void testDeleteTask() {
        // Set up the initial task data
        task.taskAmount = 4;
        task.taskNames = new String[task.taskAmount];
        task.taskDescriptions = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        task.taskDevelopers = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        task.taskDurations = new int[]{5, 8, 2, 11};
        task.taskStatuses = new String[]{"To Do", "Doing", "Done", "To Do"};
        task.taskIDs = new String[]{"ID 1", "ID 2", "ID 3", "ID 4"};

        // Perform the method call
        String result = task.deleteTask("Create Reports");

        // Verify the results
        assertEquals("Entry Create Reports successfully deleted", result);
        assertEquals(4, task.taskAmount);
        assertNull(task.taskNames[2]);
        assertEquals("Deleted", task.taskDescriptions[2]);
        assertEquals("Deleted", task.taskDevelopers[2]);
        assertEquals(0, task.taskDurations[2]);
        assertEquals("Deleted", task.taskStatuses[2]);
        assertEquals("Deleted", task.taskIDs[2]);
    }














}
