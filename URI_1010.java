public class URI_1010{
	
    public static void main(String args[])
    {
        java.util.Scanner tc = new java.util.Scanner(System.in);
        
        URI_1010 a = new URI_1010();
        URI_1010 b = new URI_1010();
        
        a.codigo = tc.nextInt();
        a.quantidade = tc.nextInt();
        a.valor = tc.nextDouble();
        
        b.codigo = tc.nextInt();
        b.quantidade = tc.nextInt();
        b.valor = tc.nextDouble();
        
        System.out.printf("VALOR A PAGAR: R$ %1.2f\n", som(mult(a.quantidade, a.valor), mult(b.quantidade, b.valor)));
    }

    private int codigo;
    private int quantidade;
    private double valor;

    static double mult(int a, double  b)
    {
        return a*b;
    }
    
    static double som(double a, double b)
    {
        return a+b;
    }
    
    public int getCodigo() { return codigo; }

    public void setCodigo(int codigo) { this.codigo = codigo; }

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValor() { return valor; }

    public void setValor(double valor) { this.valor = valor; }

}

