public class URI_1014
{
	public static void main(String [] args)
	{
    java.util.Scanner tc = new java.util.Scanner(System.in);

    int distancia = tc.nextInt();
	  double comb = tc.nextDouble();
	
	  System.out.printf("%1.3f km/l\n", total(distancia, comb));
 	}
 	
 	static double total(int a, double b)
 	{
 	    return a/b;
 	}
}
