import java.util.Scanner;

public class app{
    private static Clock clock;

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        clock.getInstance();

        System.out.println("Quantos caixas o supermercado tera? ");
        int guiches = in.nextInt();
        System.out.println("Qual o tamanho limite das filas nos caixas? ");
        int size = in.nextInt();

        Supermercado supermercado = new Supermercado(clock, guiches, size);


        while(true){
            try {
                Thread.sleep(1000);
                clock.run(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}