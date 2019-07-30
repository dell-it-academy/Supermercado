import java.util.LinkedList;
import java.util.List;

public class Supermercado{
    private LinkedList<Funcionario> funcionarios;
    private LinkedList<Caixa> guiches;
    private final int horaFechamento = 20;
    private final int horaAbertura = 8;
    private final int minutosPreparacoes = 30; 
    private double lucroTotal;
    private double prejuiso;
    private double lucro;
    private boolean aberto;


    public Supermercado(Clock clock, int guiches, int size){

        if(clock.time > 8.0 && clock.time < 20.0) aberto = true;
        else aberto = false;

        guiches = new LinkedList();
        lucroTotal = 0;
        prejuiso = 0;
        lucro = 0;

        getCaixas(guiches, size);
    }

    public double getLucro(){ return lucro; }

    public double balanco(){
        lucroTotal += lucro;
        lucro = 0;
        for(Caixa c : guiches)
            lucro += c.getLucro();
    }

    public static void watch(){
        if()
        if(clock.hour > horaAbertura && clock.hour < horaFechamento)
        watchGuiches();
    }

        //----- Private methods -----//
    private void getCaixas(int length){
        for(int i = 0; i <= length; i++){
            guiches.add(new Caixa(10));
            guiches.get(i).setAtendente(funcionarios.get(i))
        }
    }

    private void watchGuiches(){
        for(Caixa a : guiches){
            if(a.getAberto())
                if(a.getAtendente().getPonto() > (funcionario.cargaHoraria-0.3))
                    a.setAberto(false);
            else
                if(a.getFilaSize == 0)
                    a.rmAtendente();
        }
    }
}