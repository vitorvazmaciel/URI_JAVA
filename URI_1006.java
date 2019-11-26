public class URI_1006
{
	public static void main(String [] args)
	{
        java.util.Scanner tc = new java.util.Scanner(System.in);

        double a = tc.nextDouble();
	    double b = tc.nextDouble();
	    double c = tc.nextDouble();
	
	    System.out.printf("MEDIA = %1.1f\n", media(a, b, c));
 	}
 	
 	static double media(double a, double b, double c)
 	{
 	    return ((a * 2) + (b * 3) + (c * 5)) / 10;
 	}
}
