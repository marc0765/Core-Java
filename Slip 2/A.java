// Write a java program to display all the vowels from a given string.

import java.util.*;
public class Slip2A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Vowels from the string '"+str+"' are :");
        for(int i=0; i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                System.out.print(c+" ");
            }
        }
        sc.close();
    }
}
