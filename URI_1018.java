/**
 *
 * @author vitorvazmaciel
 */

public class URI_2018
{
	public static void main(String [] args)
	{
        java.util.Scanner tc = new java.util.Scanner(System.in);

        double N = tc.nextDouble();
   
	    if((N>0) && (N<1000000))
	    {
            System.out.println((int)N);
	        System.out.println((int)N/100+" nota(s) de R$ 100,00");
	            N=N%100;
	        System.out.println((int)N/50+" nota(s) de R$ 50,00");
	            N=N%50;
	        System.out.println((int)N/20+" nota(s) de R$ 20,00");
	            N=N%20;
	        System.out.println((int)N/10+" nota(s) de R$ 10,00");
                N=N%10;
	        System.out.println((int)N/5+" nota(s) de R$ 5,00");
	            N=N%5;
	        System.out.println((int)N/2+" nota(s) de R$ 2,00");
	            N=N%2;
	        System.out.println((int)N/1+" nota(s) de R$ 1,00");
	    }
   }
}
