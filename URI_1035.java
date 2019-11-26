/**
 *
 * @author vitorvazmaciel
 */

public class URI_1035
{
  public static void main(String [] args)
  {  
  java.util.Scanner tc = new java.util.Scanner(System.in);
  
  int A = tc.nextInt();
  int B = tc.nextInt();
  int C = tc.nextInt();
  int D = tc.nextInt();
  
    if (B > C && D > A && ((C + D) > (A + B)) && C > 0 && D > 0 && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
