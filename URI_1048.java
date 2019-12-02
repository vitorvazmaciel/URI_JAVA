/**
 *
 * @author vitorvazmaciel
 */

public class URI_1048
{
	public static void main(String [] args)
	{
		java.util.Scanner tc = new java.util.Scanner(System.in);
		
		URI_1048 main = new URI_1048();
		
		float n = tc.nextFloat();

		if(n >= 0 && n <=400)
		{
			float aux = (n * 15) / 100;
			main.info(n, aux, 15);
			
		}else if(n >= 400.01 && n <= 800.00)
		{
			float aux = (n * 12) / 100;
			main.info(n, aux, 12);
		}else if(n >= 800.01 && n <= 1200.00)
		{
			float aux = (n * 10) / 100;
			main.info(n, aux, 10);
		}else if(n >= 1200.01 && n <= 2000.00)
		{
			float aux = (n * 7) / 100;
			main.info(n, aux, 7);
		}else if(n > 2000.00)
		{
			float aux = (n * 4) / 100;
			main.info(n, aux, 4);
		}
	}

	void info(float a, float b, int c)
	{
			System.out.printf("Novo salario: %.2f\n", a+b);
			System.out.printf("Reajuste ganho: %.2f\n", b);
			System.out.println("Em percentual: "+c+" %");
	}
}
