public class Pessoa{
    private final String space = ",";
    private String cliente;
    private String nome;
    private String email;
    private String sexo;
    private String telefone;
    private String cep;
    private String cidade;
    private String pais;
    private String profissao;

    public Pessoa(String cliente, String nome, String email, String sexo,
    String telefone, String cep, String cidade, String pais, String profissao){
            for(byte i = 4; i >= cliente.length();)
                cliente = "0" + cliente;
        this.cliente = cliente;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
        this.pais = pais;
        this.profissao = profissao;
    }

    public String getNome(){ return nome; }
    
    public boolean set(String field, String info){
        switch(field){
            case "email": email = info; break;
            case "sexo": sexo = info; break;
            case "telefone": telefone = info; break;
            case "cep": cep = info; break;
            case "cidade": cidade = info; break;
            case "pais": pais = info; break;
            case "profissao": profissao = info; break;      
            default: return false;
        }
    return true;
    }

    public String getField(String field){
        switch(field){
            case "cliente": return cliente;
            case "nome":return nome;
            case "email":return email;
            case "sexo":return sexo;
            case "telefone":return telefone;
            case "cep":return cep;
            case "cidade":return cidade;
            case "pais":return pais;
            case "profissao":return profissao;
            default: return "none";         
        }
    }

    public String getField(int field){
        switch(field){
            case 1: return cliente;
            case 2:return nome;
            case 3:return email;
            case 4:return sexo;
            case 5:return telefone;
            case 6:return cep;
            case 7:return cidade;
            case 8:return pais;
            case 9:return profissao;
            default: return "none";         
        }
    }

    public String toString(){
        String linha = "Cliente n. "+cliente+
                        "\nNome: " + nome +
                        "\nEmail: " + email +
                        "\nSexo: " + sexo +
                        "\nTelefone: " + telefone +
                        "\nCEP: " + cep +
                        "\nCidade: " + cidade +
                        "\nPais: " + pais +
                        "\nProfissao: " + profissao;
        return linha; 
    }

    public String print(){                  //id,name,email,gender,phone,postalCode,city,country,Job
        String linha = cliente + space +
                        nome + space +
                        email + space +
                        sexo + space +
                        telefone + space +
                        cep + space +
                        cidade + space +
                        pais + space +
                        profissao;
    return linha;
    }
}