public class Cliente extends Pessoa{
    private double valorCompra;
    private 
    
    Cliente(String nome, int idade, boolean d){
        super(nome, idade, d);

        valorCompra = ((Math.random() * 10 ) * (Math.random() * 10)) + Math.random();
    }
    
    public double valorCompra(){ return valorCompra; }
}