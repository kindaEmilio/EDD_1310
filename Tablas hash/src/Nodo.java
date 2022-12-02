public class Nodo<T> {
    private Nodo<T> siguiente;
    private T dato;

    public Nodo() {
    }


    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "|" + dato + "| --> ";
    }
}