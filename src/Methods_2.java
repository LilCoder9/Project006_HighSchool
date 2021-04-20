/**
 * Class Methods_2 - Introduction (Part 2)
 * 
 * Topics:
 *   3) Creating a user-defined method
 *      a) method header and formal parameters
 *      b) method body
 *      c) returning a value
 * 
 */

import java.util.*;

public class Methods_2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int b; 
        
        requestInput();
        b = console.nextInt();
        if(isPositive(b))
        {
            System.out.print("The number is positive");
        }
        else
        {
            System.out.print("The number is NOT postive");
    }
 }
    
 public static boolean isPositive(int x)
    {
        if(x > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
 public static void requestInput()
    {
        System.out.print("Please enter an integer value:");
    }
            
}

