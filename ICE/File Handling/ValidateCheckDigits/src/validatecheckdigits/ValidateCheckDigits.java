/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Page 694 Question 6
package validatecheckdigits;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ValidateCheckDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using Buffered reader
        //validateNumbersBufferedInputStream();
        
         // Using Scanner
        validateNumberScanner();
    }

    public static void validateNumbersBufferedInputStream() {
        //put in the path to the file. See sample file in project folder
        Path file = Paths.get("");

        String line = "";

        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            line = reader.readLine();
            while (line != null) {
                //Check if string has exactly 10 digits
                if (line.length() != 10 && checkIsDigit(line)) {
                    System.out.println("Invalid data");
                } else {
                    System.out.println("Valid data");
                }

                line = reader.readLine();
            }

            reader.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }

    public static void validateNumberScanner() {
        //put in the path to the file. See sample file in project folder
        Path file = Paths.get("C:\\Users\\Work\\Documents\\NetBeansProjects\\ValidateCheckDigits\\numbers.txt");

        String line = "";
        
        try {
            Scanner scan = new Scanner(Files.newInputStream(file));
            
            //notice use of scan.hasNext()
            while (scan.hasNext()) {
                line = scan.nextLine();
                //Check if string has exactly 10 digits
                if (line.length() != 10 && checkIsDigit(line)) {
                    System.out.println("Invalid data");
                } else {
                    System.out.println("Valid data");
                }
            }
            
            scan.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
    
    public static boolean checkIsDigit(String line)
    {
        for(char c : line.toCharArray())
        {
            if(!Character.isDigit(c))
                return false;
        }
        
        return true;
    }

}
