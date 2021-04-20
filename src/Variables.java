// Copy this class to make a new class

import java.util.*;

public class Variables
{
    public int x;

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int x = 5;      //local variables to main
        int y;
        
        y = 2 * x + 1;
        
        System.out.printf("y=%d\n", triple(y) + triple(5));
        
    }
    
    public static int triple(int z)
    {
        int x;   //local variable to triple
        
        x = 3 * z;
        return x;
    }
        
        
}
