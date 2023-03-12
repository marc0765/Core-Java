// Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword)

import java.util.Scanner;
public class Slip3A 
{
    static int sum = 0;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        s.close();
        int temp = num, rem;
        while(num!=0)
        {
            rem = num % 10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        if(temp == sum)
            System.out.println(temp+" is an Armstrong number");
        else
            System.out.println(temp+" is not an Armstrong number");
    }
}
