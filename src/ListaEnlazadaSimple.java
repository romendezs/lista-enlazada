import java.util.ArrayList;

public class ListaEnlazadaSimple {

    //cabeza sera el ultimo elemento ingresado al final
    private Nodo cabeza=null;
    private ArrayList<Nodo> lista = new ArrayList<>();

    public ListaEnlazadaSimple(Nodo nodo){
        cabeza=nodo;
        lista.add(nodo);
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (lista.isEmpty()) {
            lista.add(nuevo);
            cabeza = nuevo;
        } else {
            // nuevo apunta al que era primero
            nuevo.setSiguiente(lista.getFirst());
            // insertar al inicio
            lista.addFirst(nuevo);
            // la cola (cabeza) no cambia aquí
            lista.getLast().setSiguiente(null);
        }
    }

    public int eliminarAlInicio() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vacía");
        }
        int result = lista.getFirst().getDato();
        lista.removeFirst();

        if (lista.isEmpty()) {
            cabeza = null;
        } else {
            cabeza = lista.getLast();      // actualizar cola
            cabeza.setSiguiente(null);     // último siempre apunta a null
        }
        return result;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (lista.isEmpty()) {
            lista.add(nuevo);
            cabeza = nuevo;
        } else {
            // enlazar la cola actual con el nuevo
            lista.getLast().setSiguiente(nuevo);
            lista.addLast(nuevo);
            cabeza = nuevo;                // nuevo pasa a ser la cola
        }
    }

    public int eliminarAlFinal() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vacía");
        }
        int result = lista.getLast().getDato();
        lista.removeLast();

        if (lista.isEmpty()) {
            cabeza = null;
        } else {
            cabeza = lista.getLast();
            cabeza.setSiguiente(null);
        }
        return result;
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public void imprimirLista(){
        for(Nodo nodo : lista){
            System.out.println(nodo.getDato());
        }
    }


}
