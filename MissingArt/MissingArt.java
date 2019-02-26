package MissingArt;

import java.util.*;
import java.io.*;

class MissingArt
{
    static int n = 0, x = 0, y = 0, z = 0;
    static Scanner sc;
    static File input = new File("Data/DATA30.txt");

    public static void main(String[] args)
    {
        readFile();
    }//end of main

    public static void readFile()
    {
        try
        {
            sc = new Scanner(input);
            String line = sc.nextLine();
            String[] dataCodes = line.split(" ");
            int digit;
            String newDataCode = "";
            String[] newDataCodes;

            n = Integer.parseInt(dataCodes[0]);
            x = Integer.parseInt(dataCodes[1]);
            y = Integer.parseInt(dataCodes[2]);
            z = Integer.parseInt(dataCodes[3]);

            while(true)
            {
                try
                {
                    line = sc.nextLine();
                    newDataCode = "";
                    for(int j = 0; j < line.length(); j++)
                    {
                        digit = Integer.parseInt(line.substring(j, j + 1));

                        if (digit == 0)
                        {
                            newDataCode += "" + z;
                        }//end of if

                        else if (digit % 2 == 0)
                        {
                            newDataCode += "" + (digit + x);
                        }//end of if
                        else
                        {
                            if (digit - y < 0)
                            {
                                newDataCode += "" + 0;
                            }//end of if
                            else
                            {
                                newDataCode += "" + (digit - y);
                            }//end of else
                        }//end of else
                    }//end of for
                    System.out.println(newDataCode);
                }//end of try
                catch(NoSuchElementException e)
                {
                    break;
                }//end of catch
            }//end of while
        }//end of try
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }//end of catch
    }//end of readFile
}//end of class