
/**
 * Class Rounding
 * PROGRAMMING ASSIGNMENT #7
 * 
 */
import java.util.*;

public class Rounding
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double  x, r;
        int     places;
        

        // Select random numbers
        System.out.printf("Enter a decimal number: ");
        x = console.nextDouble();
        System.out.printf("Round to how many decimal places: ");
        places = console.nextInt();
        
        // Call the rounding method and place result in variable r.

        System.out.printf("The number %f rounded to %d places is %f\n", x, places,round(x,places));
    }
    
    public static double a( double uno)
    {
        uno = 10 * uno;
        uno = Math.floor(uno + .5);
        uno = uno / 10;
        return uno;
    }
    
    public static double b( double dos)
    {
        dos = 100 * dos;
        dos = Math.floor(dos + .5);
        dos = dos / 100; 
        return dos;
    }
    
    public static double round(double x, int n)
    {
        double f;
        
        f = Math.pow(10,n) * x;
        f = Math.floor(f + .5);
        f = f / Math.pow(10,n);
        return f;
    }
        

    
    
}
