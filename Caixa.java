public class Caixa{
    private Funcionario atendente;
    private int tempoAtendimento;
    private boolean preferencial;
    private boolean aberto;
    private Cliente cliente;
    private int lucro;
    private Fila fila;

    Caixa(int filaSize){
        fila = new Fila(filaSize);
        tempoAtendimento = 0;
        atendente = null;
        cliente = null;
        aberto = false;
        lucro = 0;
    }

    public void setAberto(boolean b){ if(!atendente) aberto = b; }
    public void getAberto(boolean b){ if(!atendente) aberto = b; }
    public void setAtendente(Funcionario atendente){ this.atendente = atendente; }
    public int getFilaSize(){ return fila.size() }
    public Funcionario getAtendente(){ return atendente; }
    public Cliente atendendoCliete(){ return cliente; }

    public void rmAtendente(){
        atendente.saida();
        this.atendente = null;
    }
    
    public boolean caixaVazio(){
        if(fila.size == 0) return true;
        return false;
    }
    
    public void atendeProximo(){
        if(!caixaVazio)
            cliente = fila.remove;
            lucro = cliente.valorCompra();
    }
    
    public double getLucro(){
        int aux = lucro;
        lucro = 0;
        return aux;
    }

    public void novoCliente(Cliente cliente){
        if(funcionando)
            fila.add(cliente);
    }

    public void watchTime(){
    //    tempoAtendimento += timeLapse;
    //   if(cliente.tempoCompra() == tempoAtendimento)?
    }

}