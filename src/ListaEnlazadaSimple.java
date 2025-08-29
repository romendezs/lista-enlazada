import java.util.ArrayList;

public class ListaEnlazadaSimple {

    //cabeza sera el ultimo elemento ingresado al final
    private Nodo cabeza=null;
    private ArrayList<Nodo> lista = new ArrayList<>();

    public ListaEnlazadaSimple(Nodo nodo){
        cabeza=nodo;
        lista.add(nodo);
    }

    public void insertarAlInicio(int dato){
        lista.addFirst(new Nodo(dato));
        cabeza= lista.getLast();
        lista.get(lista.indexOf(cabeza)-1).setSiguiente(cabeza);
    }

    public int eliminarAlInicio(){
        int result = lista.getFirst().getDato();
        lista.removeFirst();
        cabeza = lista.getLast();
        lista.get(lista.indexOf(cabeza)).setSiguiente(null);
        return result;
    }

    public void insertarAlFinal(int dato){
        lista.addLast(new Nodo(dato));
        cabeza = lista.getLast();
        lista.get(lista.indexOf(cabeza)-1).setSiguiente(cabeza);
    }

    public int eliminarAlFinal(){
        int result = lista.getLast().getDato();
        lista.removeLast();
        cabeza = lista.getLast();
        lista.get(lista.indexOf(cabeza)).setSiguiente(null);
        return result;
    }

    public boolean estaVacia(){
        if (cabeza == null){
            return true;
        }
        return false;
    }

    public void imprimirLista(){
        for(Nodo nodo : lista){
            System.out.println(nodo.getDato());
        }
    }


}
