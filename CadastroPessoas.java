import java.io.IOException; 
import java.nio.charset.Charset; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;

public class CadastroPessoas{
    ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();

    public CadastroPessoas(){ Pessoas = new ArrayList<Pessoas>(); }

    public int carregaDados(CadastroPessoas cc){
        String currDir = Paths.get("").toAbsolutePath().toString(); // Obtem o caminho para o diretório corrente 
        String nameComplete = currDir+"\\"+"Pessoas.csv"; // Monta o nome do arquivo 
        Path path = Paths.get(nameComplete); // Cria acesso ao "diretorio" da mídia (disco)
        
        
        Pessoas.clear(); //Limpar referencias
        int cadastros = 0; //Novos Pessoas cadastrados
        
        try (Scanner in = new Scanner(Files.newBufferedReader(path, Charset.forName("utf-8")))){ 
            in.useDelimiter("[,\n]"); // separadores: ; e nova linha 
            in.nextLine();

            while(in.hasNext()){
                cadastros = Integer.parseInt(in.next());
                Pessoas.add(new Pessoa(in.next(), in.next(), in.next(), in.next(),
                                          in.next(), in.next(), in.next(), in.next()));
            }
            
        }catch (IOException x){ 
            System.err.format("Erro de E/S: %s%n", x); 
        }
        
        return cadastros;
    }

    public LinkedList getPessoas(){ return pessoas;}
}