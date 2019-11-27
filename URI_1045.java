/**
 *
 * @author vitorvazmaciel
 */

public class URI_1045 
{
    public static void main(String [] args) 
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);

            float A = tc.nextFloat();
            float B = tc.nextFloat();
            float C = tc.nextFloat();

            // Ordenação decrescente dos valores
            if(A < B)
            {
		float aux = A;
		A = B;
		B = aux;
            }
            if(A < C)
            {
		float aux = A;
		A = C;
		C = aux;
            }
            if(B < C)
            {
                float aux = B;
		B = C;
		C = aux;
            }
            
            // Verificação dos triângulos
            if(A > 0 && B > 0 && C > 0)
            {
		if(A >= B + C)
		{
                    System.out.println("NAO FORMA TRIANGULO");
		}else
                {
                    if((A*A) == (B*B) + (C*C))
                    {
			System.out.println("TRIANGULO RETANGULO");
                    }if((A*A) > (B*B) + (C*C))
                    {
			System.out.println("TRIANGULO OBTUSANGULO");
                    }if((A*A) < (B*B) + (C*C))
                    {
			System.out.println("TRIANGULO ACUTANGULO");
                    }if(A == B && B == C)
                    {
			System.out.println("TRIANGULO EQUILATERO");
                    }if(((A == B) && (A != C)) || ((A == C) && (A != B)) || ((B == C) && (B != A)))
                    {
                        System.out.println("TRIANGULO ISOSCELES");
                    }
		}
            }
    }
}
