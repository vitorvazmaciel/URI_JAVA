/**
 *
 * @author vitorvazmaciel
 */

public class URI_1038
{
  public static void main(String args[])
  {  
    java.util.Scanner tc = new java.util.Scanner(System.in);
  
    int cod = tc.nextInt();
    int quant = tc.nextInt();
  
    switch(cod)
    {
	        case 1:
                double total1 = quant * 4.00;
                    System.out.printf("Total: R$ %.2f\n", total1);
	        break;
	  
          case 2:
                double total2 = quant * 4.50;
                    System.out.printf("Total: R$ %.2f\n", total2);
	        break;
	  
          case 3:
                double total3 = quant * 5.00;
                    System.out.printf("Total: R$ %.2f\n", total3);
	        break;
	  
          case 4: 
                double total4 = quant * 2.00;
                    System.out.printf("Total: R$ %.2f\n", total4);
	        break;
	  
          default:
                double total5 = quant * 1.50;
                    System.out.printf("Total: R$ %.2f\n", total5);
    }
  }
}
