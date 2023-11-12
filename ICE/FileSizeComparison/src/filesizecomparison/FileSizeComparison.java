/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Page 693 Question 3
package filesizecomparison;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author chris
 */
public class FileSizeComparison {

    public static void main(String[] args) {
        Path filePath = Paths.get("\"C:\\Users\\chris\\OneDrive\\Documents\\NetBeansProjects\\FileSizeComparison\\teenageDirtbagLyrics.txt\"");
        Path filePath1 = Paths.get("\"C:\\Users\\chris\\OneDrive\\Documents\\NetBeansProjects\\FileSizeComparison\\teenageDirtbag.docx\"");

        Path file1, file2;
        
        System.out.println(getFileSizeBytes(file1));
    }
    
    private static String getFileSizeBytes(File file) {
		return file.length() + " bytes";

}
}
