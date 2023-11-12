/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Page 693 Question 2
package comparefolders;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Work
 */
public class CompareFolders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Replace these with your own folders
         Path filePath = Paths.get("C:\\Users\\Work\\Documents\\Classwork\\ClassExercise.docx");
         Path filePath1 = Paths.get("C:\\Users\\Work\\Documents\\Classwork\\file1.docx");
         Path filePath2= Paths.get("C:\\Users\\Work\\Documents\\Classwork\\file2.docx");
         
         Path folder1, folder2, folder3;
         
         //subpath excludes the second number - just like string.substring() method
//         folder1 = filePath.subpath(0, filePath.getNameCount()-1);
//         folder2 = filePath1.subpath(0, filePath1.getNameCount()-1);
//         folder3 = filePath2.subpath(0, filePath2.getNameCount()-1);
         
         //A better way of doing the above
         folder1 = filePath.getParent();
         folder2 = filePath1.getParent();
         folder3 = filePath2.getParent();
                  
         if(folder1.equals(folder2) && folder1.equals(folder3))
             System.out.println("Same folder");
         else System.out.println("Different folders");
         
    }
    
}
