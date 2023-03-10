// Write a ‘java’ program to copy only non-numeric data from one file to another file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Slip1B 
{ 
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader(""); //Path of file to read from
            FileWriter writer = new FileWriter(""); //Path of file to copy to
            int ch;
            while((ch = file.read()) != -1)
            {
                if(!Character.isDigit(ch))
                    writer.write(ch);
            }
            System.out.println("Data copied successfully");
            file.close();
            writer.close();
        }
      
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
      
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
