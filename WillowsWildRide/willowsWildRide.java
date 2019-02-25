package WillowsWildRide;

import java.util.*;
import java.io.*;

class willowsWildRide
{
    static int t; //days in the week t={2 <= t <=7}
    static int n; //days in the year n={1 <= n <= 365}
    static int DL = 0; //days left till willow gets bored of the box 
    static File input = new File("Data/DATA12.txt");
    static String[][] data = new String[10][2];

    public static void main(String[] args)
    {
        readFile();
    }//end of main

    public static void readFile()
    {
        try 
        {
            Scanner sc = new Scanner(input); // initializes the scanner
            while(true)
            {
                try
                {
                    String line  = sc.nextLine();

                    t = Integer.parseInt(line.substring(0, 1));
                    n = Integer.parseInt(line.substring(2, line.length()));

                    DL = 0;
                    for(int i = 0; i < n; i++)
                    {
                        if (sc.nextLine().equals("B"))
                        {
                            DL += t;
                        }//end of 
                            
                        if (DL > 0)
                        {
                            DL--;
                        }//end of if
                    }//end of for
                    System.out.println(DL);
                    }
                    catch(NoSuchElementException e)
                    {
                        break;
                    }//end of catch
            }//end of while
            sc.close();
        }//end of try
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }// end of catch
    }//end of readFile
}//end of class