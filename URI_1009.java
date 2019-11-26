public class URI_1009
{
	public static void main(String [] args)
	{
    		java.util.Scanner tc = new java.util.Scanner(System.in);

		String nome = tc.nextLine();
    		double salario = tc.nextDouble();
		double vendas = tc.nextDouble();
	
		System.out.printf("TOTAL = R$ %1.2f\n", total(salario ,comissao(vendas)));
	}
	
	static double comissao(double a)
	{
	    return (15*a) / 100;
	}
	
	static double total(double a, double b)
	{
	    return a+b;
	}

}
