public class URI_1003
{
    public static void main(String [] args)
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
   
        int a = tc.nextInt();
        int b = tc.nextInt();

        System.out.println("SOMA = "+soma(a, b));
    }
    
    static int soma(int a, int b)
    {
        return a+b;
    }
}
