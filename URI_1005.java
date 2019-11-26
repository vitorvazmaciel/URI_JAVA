public class URI_1005.java
{
	public static void main(String [] args)
	{
        java.util.Scanner tc = new java.util.Scanner(System.in);

        double a = tc.nextDouble();
	      double b = tc.nextDouble();
	
	      System.out.printf("MEDIA = %1.5f\n", media(a, b));
 	}
 	
 	static double media(double a, double b)
 	{
 	    return ((a * 3.5) + (b * 7.5)) / 11;
 	}
}
