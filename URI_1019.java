/**
 *
 * @author vitorvazmaciel
 */

public class URI_1019
{
  public static void main(String [] args)
  {  
    java.util.Scanner tc = new java.util.Scanner(System.in);
    int n = tc.nextInt();
    int hrs, min;
    min = 0;
    hrs = 0;
  
    if( n>60)
    {
	  min = (int)n/60;
	  n = n % 60;
	   if(min > 60)
	   {
	   hrs = (int)min/60;
	   min = min % 60;
	   }
	}
  
    System.out.printf("%d:%d:%d\n", hrs, min, n);
  }
}
