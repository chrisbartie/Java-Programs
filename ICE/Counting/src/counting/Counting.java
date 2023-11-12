package counting;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args)
    {
        countByFives();
        countByAnything();
    }//end main

    public static void countByFives()
    {
        int counter = 5;
        boolean firstInLine = true;
        while (counter <= 500)
        {
            if (counter % 50 == 0)
            {
                System.out.print(" " + counter);
                firstInLine = true;
            }//end if
            else 
            {

                if (firstInLine) 
                {
                    System.out.print(counter);
                    firstInLine = false;
                } 
                else
                {
                    System.out.print(" " + counter);
                }
            }
                    counter = counter + 5;
                }
            }
        public static void countByAnything()
        {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Enter a number to count by: ");
            int increment = scan.nextInt();
            scan.nextLine();
            
            int counter = 5;
            int lineCounter = 1;
            
                    
                    while(counter < 500)
                    {
                        if(lineCounter == 10)
                        {
                            System.out.println(" " + counter + "\n");
                            lineCounter = 1;
                        }else if(lineCounter == 1){
                            System.out.println(counter);
                            lineCounter++;
                        }else{
                            System.out.println(" " + counter);
                            lineCounter++;
                            
                            
                        }
                    }
            
        }
        }
    
    


