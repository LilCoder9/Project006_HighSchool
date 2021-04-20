
/**
 * Write a description of class Quadratic2 here.
 * PROGRAMMING ASSIGNMENT #7
 * 
 * Chris de Castro
 * 
 */
import java.util.*;

public class Quadratic2
{
    public static void main(String[] args)
    {
        double a, b, c;     // coefficients
        double discr;       // discriminant
        double x1, x2;      // solutions
        int    n;           // number of decimal places
        
        Scanner console = new Scanner(System.in);
        System.out.println("Quadratic equation solver:  a*x^2 + b*x + c = 0");
        System.out.print("a=? ");
        a = console.nextDouble();
        System.out.print("b=? ");
        b = console.nextDouble();
        System.out.print("c=? ");
        c = console.nextDouble();
        System.out.print("Round to how many decimal places? ");
        n = console.nextInt();
        
        // compute the discriminant
        discr = b*b - 4 * a * c;
   
        System.out.printf("The discriminant is %.2f\n", discr);
        
        if(discr == 0)
        {
            x1 = -b / (2 * a);
            System.out.printf("The equation has 1 real solution, x = %.8f", round(x1,n));
        }
        else if(discr < 0)
        {
            System.out.println("The equation has NO real solutions!");
        }
        else
        {
            x1 = (-b + sqrt2(discr))/(2*a);
            x2 = (-b - sqrt2(discr))/(2*a);
            System.out.printf("The equation has 2 real solutions, x = %.8f and x = %.8f", round(x1,n),round(x2,n));
        }
        
    }
    
     public static double sqrt2( double x )
    {
        double low = 0;
        double high = x + 1;   // corrected to round numbers between 0 and 1.
        double trial;
        
        while( (high-low) > 10e-5 )
        {
          trial = (high + low) / 2;
          if(trial * trial == x )
            return trial;
          else if( (trial * trial) > x)
            high = trial;
          else
            low  = trial;
        }
        return high;
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
