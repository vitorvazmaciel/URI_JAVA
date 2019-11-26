public class URI_1008
{
    public static void main(String [] args)
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);

        int func = tc.nextInt();
	double horas = tc.nextInt();
	double valor = tc.nextDouble();
	    
	System.out.println("NUMBER = " + func);
	System.out.printf("SALARY = U$ %1.2f\n", salario(horas, valor));
    }
    
    static double salario(double a, double b)
    {
        return a * b;
    }
}
