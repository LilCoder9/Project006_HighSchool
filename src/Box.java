
/**
 * Class Box
 * 
 */
public class Box
{
    private int l;  // l is length    (2 instance variables)
    private int w;  // w is width
    
    public Box()    // class Constructor
    {
        l=5;
        w=10;
    }
    
    public Box( int a, int b)
    {
        l = a;
        w = b;
    }
    
    // "accessor" methods  (getter)
    public int getLength( )
    {
        return l;
    }
    public int getWidth()
    {
        return w;
    }
    
    // "mutator" methods (setter)
    public void setLength( int x )
    {
        if( x > 0 )
           l = x;
    }
    
    public void setWidth( int x )
    {
        if( x > 0 )
           w = x;
    }
    
    public int area()
    {
        return l*w;
    }
    
    public boolean isBigger( Box a )
    {
        if( this.area() > a.area() )
           return true;
           
        return false;
    }
    
}
