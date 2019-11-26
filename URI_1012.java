/**
 *
 * @author vitorvazmaciel
 */

public class URI_1012
{
	public static void main(String [] args)
        {
            java.util.Scanner tc = new java.util.Scanner(System.in);

            double A = tc.nextDouble();
            double B = tc.nextDouble();
            double C = tc.nextDouble();

	
            System.out.printf("TRIANGULO: %1.3f\n", triangle(A, C));
            System.out.printf("CIRCULO: %1.3f\n", circle(C));
            System.out.printf("TRAPEZIO: %1.3f\n", trapeze(A, B, C));
            System.out.printf("QUADRADO: %1.3f\n", square(B));
            System.out.printf("RETANGULO: %1.3f\n", rectangle(A, B));
        }
        
        static double triangle(double a, double c)
        {
            return (a*c) / 2;
        }
        
        static double circle(double c)
        {
            return 3.14159 * (c*c);
        }
        
        static double trapeze(double a, double b, double c)
        {
            return ((a + b) * c) / 2;
        }
        
        static double square(double b)
        {
            return b*b;
        }
        
        static double rectangle(double a, double b)
        {
            return a*b;
        }
}
