/**
 *
 * @author vitorvazmaciel
 */

public class Main
{
        public static void main(String [] args)
        {
          java.util.Scanner tc = new java.util.Scanner(System.in);

	  Main a = new Main();
          Main b = new Main();
        
          a.x = tc.nextDouble();
          a.y = tc.nextDouble();
        
          b.x = tc.nextDouble();
          b.y = tc.nextDouble();
	
          System.out.printf("%.4f\n", Math.sqrt(oper(a.x, b.x, a.y, b.y)));
        }
        
    private double x;
    private double y;

    static double oper(double a, double b, double c, double d)
    {
        return ((b - a)*(b - a)) + ((d - c)*(d - c));
    }
        
}
