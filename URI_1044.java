/**
 *
 * @author vitorvazmaciel
 */

public class URI_1044
{
	public static void main(String [] args)
	{
		java.util.Scanner tc = new java.util.Scanner(System.in);

		int A = tc.nextInt();
		int B = tc.nextInt();

		if(A % B == 0 || B % A == 0)
		{
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}
}
