public class URI_1004
{
    public static void main(String [] args)
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
   
        int a = tc.nextInt();
        int b = tc.nextInt();

        System.out.println("PROD = "+prod(a, b));
    }
    
    static int prod(int a, int b)
    {
        return a*b;
    }
}
