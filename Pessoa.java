public class Pessoa{
    private boolean deficiente;
    private boolean idoso;
    private String nome;
    private int idade;

    Pessoa(String nome, int idade, boolean d, boolean i){
        this.deficiente = d;
        this.idade = idade;
        this.nome = nome;
        this.idoso = i;
    }

    public String getNome(){ return nome; }
    public int getIdade(){ return idade; }
    public boolean deficiente(){ return deficiente; }
    public boolean deficiente(){ return idoso; }
}