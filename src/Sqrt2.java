
/**
 * Class Sqrt2
 * 
 * HOPEFULLY YOU DEVELOPED THIS METHOD IN THE PRIOR PROGRAMMING
 * ASSIGNMENT!
 * 
 */
import java.util.*;

public class Sqrt2
{
	public static void main(String[] args)
    {
        double x;           
        double ans;
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("x = ? ");
        x = console.nextDouble();

        ans = sqrt2(x);
    
        System.out.printf("The square root of %.5f is %.5f\n", x, ans);
        console.close();
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
}
