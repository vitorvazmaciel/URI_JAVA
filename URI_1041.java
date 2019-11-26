/**
 *
 * @author vitorvazmaciel
 */

public class URI_1041
{
	public static void main(String [] args)
	{
		java.util.Scanner tc = new java.util.Scanner(System.in);

		float x = tc.nextFloat();
		float y = tc.nextFloat();

		if(x == 0 && y == 0)
		{
			System.out.println("Origem");
		}else if(y == 0)
		{
			System.out.println("Eixo X");
		}else if(x == 0)
		{
			System.out.println("Eixo Y");
		}else if(x > 0 && y > 0)
		{
			System.out.println("Q1");
		}else if(x < 0 && y > 0)
		{
			System.out.println("Q2");
		}else if(x < 0 && y < 0)
		{
			System.out.println("Q3");
		}else{
			System.out.println("Q4");
		}
	}
}
