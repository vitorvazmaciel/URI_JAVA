/**
 *
 * @author vitorvazmaciel
 */

public class URI_1013
{
	public static void main(String [] args)
	{
    	java.util.Scanner tc = new java.util.Scanner(System.in);

	int a = tc.nextInt();
	int b = tc.nextInt();
	int c = tc.nextInt();
	
	int maior = a;
	if((a<b) || (a<c))
	{
		if(b<c)
		{
		    maior = c;
		}else
		{
		    maior = b;
		}
	}
	
    	System.out.println(maior+" eh o maior");
   
 	}
}
