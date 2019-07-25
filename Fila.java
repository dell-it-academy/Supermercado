public class Fila{
    private Queue<Cliente> fila;
    private int size;

    public File(int size){
        fila = new LinkedList<>();
        this.size = size;
    }

    public void add(Cliente e){
        if(fila.size() < size)
            fila.add(e);
    }

    public Cliente remove(){
        return fila.remove();
    }

    public int size(){
        return fila.size();
    }
}