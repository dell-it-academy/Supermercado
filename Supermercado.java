import java.util.LinkedList;
import java.util.List;

public class Supermercado{
    private LinkedList<Caixa> guiches;    
    private double lucroTotal;
    private double prejuiso;
    private double lucro;


    public Supermercado(){
        guiches = new LinkedList();
        lucroTotal = 0;
        prejuiso = 0;
        lucro = 0;

        getCaixas();
    }

    public double getLucro(){ return lucro; }

    private void getCaixas(){
        guiches.add(new Caixa(10,false));
        guiches.add(new Caixa(10,false));
        guiches.add(new Caixa(10,false));
        guiches.add(new Caixa(10,false));
        guiches.add(new Caixa(5,true));
    }

    public double balanco(){
        lucroTotal += lucro;
        lucro = 0;
        for(Caixa c : guiches)
            lucro += c.getLucro();
    }

}