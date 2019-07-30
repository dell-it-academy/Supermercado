public class Funcionario{
    private static final double cargaHoraria = 8.0;
    private double ponto;
    private Pessoa pessoa;


    Funcionario(Pessoa pessoa){
        this.pessoa = pessoa;
        ponto = 0.0;
        cargaHoraria = 0;
    }

    public void getPonto(double ponto){
        this.ponto += ponto;
    }
    public void saida(){ ponto = 0; }
}