public class URI_1002
{
    public static void main(String [] args)
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
   
        double raio = tc.nextDouble();

        System.out.printf("A=%2.4f\n",circ(raio));
    }
    
    static double circ(double c)
    {
        return c = 3.14159 * (c*c);
    }
}
