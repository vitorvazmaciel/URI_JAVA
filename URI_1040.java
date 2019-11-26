/**
 *
 * @author vitorvazmaciel
 */

public class URI_1040
{
    public static void main(String [] args) 
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
        float n1 = tc.nextFloat();
        float n2 = tc.nextFloat();
        float n3 = tc.nextFloat();
        float n4 = tc.nextFloat();

        float media = ( (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1) ) / 10;

	if(media >= 7.0)
	{
            System.out.printf("Media: %.1f\n",media);
            System.out.printf("Aluno aprovado.\n");
	}else 
            if(media >= 5.0 && media <=6.9)
            {
                    float aux = tc.nextFloat();
                    float newMedia;
                        
                    System.out.printf("Media: %.1f\n",media);
                    System.out.printf("Aluno em exame.\n");
                    System.out.printf("Nota do exame: %.1f\n", aux);

                    newMedia = (media + aux) / 2;
                        if(newMedia >= 5.0)
                        {
                            System.out.printf("Aluno aprovado.\n");
                            System.out.printf("Media final: %.1f\n", newMedia);
                        }else
                        {
                            System.out.printf("Aluno reprovado.\n");
                            System.out.printf("Media final: %.1f\n", newMedia);
                        }
            }else
            {
		System.out.printf("Media: %.1f\n", media);
		System.out.printf("Aluno reprovado.\n");
	    }
    }
}
