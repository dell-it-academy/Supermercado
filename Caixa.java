public class Caixa{
    private Funcionario atendente;
    private boolean preferencial;
    private boolean funcionando;
    private Cliente cliente;
    private int lucro;
    private Fila fila;

    Caixa(int filaSize, boolean preferencial){
        fila = new Fila(filaSize);
        funcionando = false;
        atendente = null;
        cliente = null;
        lucro = 0;
    }

    public void setFuncionando(boolean b){ if(!atendente) funcionando = b; }
    public void setAtendente(Funcionario atendente){ this.atendente = atendente; }
    public Cliente atendendoCliete(){ return cliente; }

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
        return a;
    }

    public void novoCliente(Cliente cliente){
        if(funcionando)
            fila.add(cliente);
    }
}