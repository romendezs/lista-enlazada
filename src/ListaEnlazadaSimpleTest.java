import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaSimpleTest {
    private ListaEnlazadaSimple lista;

    @BeforeEach
    void setUp() {
        lista = new ListaEnlazadaSimple(new Nodo(10)); // Lista inicia con un nodo
    }

    @Test
    void testInsertarAlInicio() {
        lista.insertarAlInicio(5);
        assertEquals(5, lista.eliminarAlInicio(), "El primer nodo debe ser 5");
    }

    @Test
    void testInsertarAlFinal() {
        lista.insertarAlFinal(20);
        assertEquals(20, lista.eliminarAlFinal(), "El último nodo debe ser 20");
    }

    @Test
    void testEliminarAlInicio() {
        lista.insertarAlInicio(5);
        int eliminado = lista.eliminarAlInicio();
        assertEquals(5, eliminado, "Debe eliminar el primer nodo (5)");
    }

    @Test
    void testEliminarAlFinal() {
        lista.insertarAlFinal(30);
        int eliminado = lista.eliminarAlFinal();
        assertEquals(30, eliminado, "Debe eliminar el último nodo (30)");
    }

    @Test
    void testEstaVacia() {
        // Al inicio no está vacía
        assertFalse(lista.estaVacia());

        // Eliminar todos
        lista.eliminarAlInicio();
        assertTrue(lista.estaVacia(), "Debe estar vacía después de eliminar todos los nodos");
    }
}
