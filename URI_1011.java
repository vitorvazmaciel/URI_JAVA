/**
 *
 * @author vitorvazmaciel
 */

public class URI_1011
{
	public static void main(String [] args)
	{
    		java.util.Scanner tc = new java.util.Scanner(System.in);

		double raio = tc.nextDouble();

		System.out.printf("VOLUME = %1.3f\n", volume(raio));
	}
 	
 	static double volume(double r)
 	{
 	    return 4.0/3 * 3.14159 * (r * r * r);
 	}
}
