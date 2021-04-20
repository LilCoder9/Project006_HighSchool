/**
 * Class BoxDriver - Demonstrate use of Box class
 * 
 */
import java.util.*;

public class BoxDriver
{
    public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       
       Box hannah, bob;
       
       hannah = new Box();
       
       hannah.setLength( 20 );    // hannah.l = 20;
       
       hannah.setLength( 10 );   //hannah.l = 10;
       
       hannah.setLength( -10 );   // hannah.l = -10;
       hannah.setWidth( 15 );     // hannah.w = 15;
       
       System.out.println( hannah );  // prints address of Box
       
       System.out.printf("Hannah's ares is %d\n",
                          hannah.area() );
       bob = new Box(8, 20);
       
       bob.setLength( 12 );   // bob.l = 12;
       bob.setWidth( hannah.getWidth()  );   // bob.w = hannah.w;
       
       bob = hannah;
       
       System.out.printf("bobs l is %d and w is %d\n",
                           bob.getLength() , 
                           bob.getWidth() );
       
       
       
      
    }
}
