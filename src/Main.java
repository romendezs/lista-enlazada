//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nodo nodo1 = new Nodo(10);
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple(nodo1);

        System.out.println("La lista se encuentra " + (lista.estaVacia()? "vacia" : "con valores"));
        lista.insertarAlInicio(9);
        lista.insertarAlInicio(8);

        System.out.println("Eliminado: " + lista.eliminarAlInicio());;

        lista.insertarAlFinal(7);
        lista.insertarAlFinal(6);

        System.out.println("Eliminado: " + lista.eliminarAlFinal());

        lista.imprimirLista();
    }
}