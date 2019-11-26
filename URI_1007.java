/**
 *
 * @author vitorvazmaciel
 */

public class Main
{
      public static void main(String [] args)
      {
      	    java.util.Scanner tc = new java.util.Scanner(System.in);

            int a = tc.nextInt();
	    int b = tc.nextInt();
	    int c = tc.nextInt();
	    int d = tc.nextInt();
	    
	    System.out.println("DIFERENCA = "+dif(a, b, c, d));
 	}
 	
 	static int dif(int a, int b, int c, int d)
 	{
 	    return (a*b - c*d);
 	}
}
