
package prjbubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class PrjBubbleSort {

    
    public static void main(String[] args) {
        //0 , 1 , 2 , 300, 700, 900
        int[] intNum = {900, 300, 700};
        int intTemp = 0;
        
        String strMessage = "Numbers BEFORE bubble "
                + "sort\n\n";
        display_numbers(intNum, strMessage);
        
        int count = intNum.length;// returns back length of the array count = 3
        for (int y = 0; y < count; y++)//y = 0
        {
            //Loops to compare each array item
            for (int x = 0; x < intNum.length - 1; x++)// x = 2
            {
                if(intNum[x] < intNum[x + 1])// 900 > 700
                {
                    intTemp = intNum[x]; //0 = 900
                    intNum[x] = intNum[x + 1];// 900 = 700
                    intNum[x + 1] = intTemp;// 700 = 900
                }
            }
            count--; //1
        }    
        strMessage = "Numbers AFTER bubble sort\n\n";
        display_numbers(intNum, strMessage);
    }
    
    private static void display_numbers(int[] intNum,
            String strMessage)
    {
        for(int x = 0; x < intNum.length; x++)
        {
            strMessage += intNum[x] + "\n";
        }
        JOptionPane.showMessageDialog(null, strMessage);
        
    }
    
}
