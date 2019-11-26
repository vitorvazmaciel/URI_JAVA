/**
 *
 * @author vitorvazmaciel
 */

public class URI_1036
{
  public static void main(String [] args)
  {  
    java.util.Scanner tc = new java.util.Scanner(System.in);
  
    double A = tc.nextDouble();
    double B = tc.nextDouble();
    double C = tc.nextDouble();
  
    if(A == 0 || ((B*B) - (4 * A * C)) < 0)
    {
	      System.out.println("Impossivel calcular");
    }else
    {	  
        double r1 = ((-B + delta(A, B ,C)) / (2 * A));
        double r2 = ((-B - delta(A, B ,C)) / (2 * A));
	  
	      System.out.printf("R1 = %.5f\n", r1);
	      System.out.printf("R2 = %.5f\n", r2);
    }
  }

  static double delta(double a, double b, double c)
  {
      return Math.sqrt((b*b)-(4 * a * c));
  }

}
