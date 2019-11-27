/**
 *
 * @author vitorvazmaciel
 */

public class Main 
{

    public static void main(String [] args) 
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
        int A = tc.nextInt();
        int B = tc.nextInt();

        if(A > B)
        {
        	System.out.printf("O JOGO DUROU %d HORA(S)\n", maior(A,B));
        }else if(A < B)
        {
        	System.out.printf("O JOGO DUROU %d HORA(S)\n", menor(A,B));
        }else
        {
        	System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }
    }

    static int maior(int a, int b)
    {
    	return (24+b)-a;
    }

    static int menor(int a, int b)
    {
    	return b-a;
    }
    
}
