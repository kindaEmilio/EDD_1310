public class Nodo<T> {
    private T data;
    private Nodo<T> siguiente;

    public Nodo() {
    }

    public Nodo(T valor) {
        this.data = valor;
    }

    public Nodo(T data, Nodo<T> siguiente) {
        this.data = data;
        this.siguiente = siguiente;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "|" + data + "| --> ";
    }
}