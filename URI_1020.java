/**
 *
 * @author vitorvazmaciel
 */

public class URI_1020
{
  public static void main(String [] args)
  {  
    java.util.Scanner tc = new java.util.Scanner(System.in);
  
    int anostotal = tc.nextInt();
    int anos, meses, dias;
  
    anos = (int)anostotal / 365;
    meses = (int)(anostotal % 365) / 30;
    dias = (int)(anostotal % 365) % 30;

    System.out.println(anos+" ano(s)");	
    System.out.println(meses+" mes(es)");	
    System.out.println(dias+" dia(s)");
      
  }
}
