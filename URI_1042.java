/**
 *
 * @author vitorvazmaciel
 */

public class URI_1042
{
	public static void main(String [] args)
	{
		java.util.Scanner tc = new java.util.Scanner(System.in);

		int A = tc.nextInt();
		int B = tc.nextInt();
		int C = tc.nextInt();

		int Aorigin = A, Borigin = B, Corigin = C;

		if(A > B)
		{
			int aux = A;
			A = B;
			B = aux;
		}
		if(A > C)
		{
			int aux = A;
			A = C;
			C = aux;
		}
		if(B > C)
		{
			int aux = B;
			B = C;
			C = aux;
		}

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println();
		System.out.println(Aorigin);
		System.out.println(Borigin);
		System.out.println(Corigin);

	}
}
