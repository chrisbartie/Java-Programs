/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Page 693 question 1
package filestatistics;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author Work
 */
public class FileStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Replace with your own file
        Path filePath = Paths.get("C:\\Users\\Work\\Documents\\Classwork\\ClassExercise.docx");
        
        try{
            BasicFileAttributes ba = Files.readAttributes(filePath, BasicFileAttributes.class);
            
            System.out.println("File name: " + filePath.getFileName());
            System.out.println("Containing folder: " + filePath.getName(filePath.getNameCount()-2));
            System.out.println("File size: " + ba.size());
            System.out.println("Last modified: " + ba.lastModifiedTime());
            
        }catch(Exception e)
        {
            System.out.println(e.getCause().toString());
        }
        
    }
    
}
