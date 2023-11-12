package bubblesort2;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class BubbleSort2 {

    private static int[] intArrayResults; //Array declared without size

    private static int intTemp = 0; //Variable to hold the swap value

    public static void main(String[] args) {
        //Ask the user how many results there are

        int intResults
                = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Please enter in the number "
                        + ""
                        + "of results"));
        //Set the array size to the number of results
        intArrayResults = new int[intResults];

        for (int x = 0; x < intResults; x++) {
            intArrayResults[x]
                    = Integer.parseInt(JOptionPane.showInputDialog(
                            null,
                            "Enter result " + (x + 1)));

        }
        int intConfirm = JOptionPane.showConfirmDialog(null,
                "Would you like to"
                + " sort the results?", "Sort",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (intConfirm == JOptionPane.YES_NO_OPTION) {
            display_numbers("Not Sorted");
            bubble_sort();
            display_numbers("Sorted");

        } else {
            display_numbers("Not Sorted");
        }
        JOptionPane.showMessageDialog(null,
                "Thank you for using the application");
        System.exit(0); //End the application

    }
    private static void display_numbers(String strMessage)
    {
        strMessage = "Student Results - " + strMessage + "\n\n";
        for(int x = 0; x < intArrayResults.length; x++)
        {
            strMessage += intArrayResults[x] + "%\n";
        }
        JOptionPane.showMessageDialog(null, strMessage);
        
    }
    private static void bubble_sort()
    {
        for (int y = 0; y < intArrayResults.length - 1; y++)
        {
            for (int x = 0; x < intArrayResults.length - 1; x++)
            {
                if (intArrayResults[x] > intArrayResults[x + 1])
                {
                    intTemp = intArrayResults[x];
                    intArrayResults[x] = intArrayResults[x + 1];
                    intArrayResults[x + 1] = intTemp;
                }
            }
        }
    }

}
