/**
 *
 * @author vitorvazmaciel
 */

public class URI_1017
{
  public static void main(String [] args)
  {  
    java.util.Scanner tc = new java.util.Scanner(System.in);
    int temp = tc.nextInt();
    int vm = tc.nextInt();
  
    System.out.printf("%.3f\n", mult(temp, vm) / 12);
  }
  
  static double mult(int a, int b)
  {
      return (double)a*(double)b;
  }
}
