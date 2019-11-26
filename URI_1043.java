/**
 *
 * @author vitorvazmaciel
 */

public class URI_1043
{
	public static void main(String [] args)
	{
		java.util.Scanner tc = new java.util.Scanner(System.in);

		float A = tc.nextFloat();
		float B = tc.nextFloat();
		float C = tc.nextFloat();

		float Aorigin = A, Borigin = B, Corigin = C;

		if(A > B)
		{
			float aux = A;
			A = B;
			B = aux;
		}
		if(A > C)
		{
			float aux = A;
			A = C;
			C = aux;
		}
		if(B > C)
		{
			float aux = B;
			B = C;
			C = aux;
		}

		if(A + B > C)
		{
			System.out.printf("Perimetro = %.1f\n", perimeter(A, B, C));
		}else{
			System.out.printf("Area = %.1f\n", area(Aorigin, Borigin, Corigin));
		}
	}

	static float perimeter(float a, float b, float c)
	{
		return a+b+c;
	}

	static float area(float a, float b, float c)
	{
		return ((a+b) * c) / 2;
	}
}
