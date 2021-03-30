/**

Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
*/

import java.util.Scanner;
public class ReadsFloatingNumber {

   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double n = in.nextDouble();

        if (n > 0)
        {
            if (n < 1)
            {
                System.out.println("Positive small");
            }
            else if (n > 1000000)
            {
                System.out.println("Positive large");
            }
            else
            {
                System.out.println("Positive");
            }
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
            {
                System.out.println("Negative small");
            }
            else if (Math.abs(n) > 1000000)
            {
                System.out.println("Negative large");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
