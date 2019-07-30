public class Cliente{
    private double valorCompra;
    private int tempoCompra;
    private Pessoa pessoa;
    
    Cliente(Pessoa pessoa){
        this.pessoa = pessoa;

        valorCompra = ((Math.random() * 10 ) * (Math.random() * 10)) + Math.random();
        tempoCompra = (int) (Math.random() * 10) + 5;
    }
    
    public double valorCompra(){ return valorCompra; }
    public double tempoCompra(){ return tempoCompra; }
    public Pessoa getPessoa(){ return pessoa; }
    
}