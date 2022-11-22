public class ColaNodo<T> {
    private Nodo<T> primero;
    private Nodo<T> atras;
    private int length;

    public ColaNodo() {
        primero = atras = null;
        length = 0;
    }

    public boolean estaVacia() {
        return primero == null && length == 0;
    }

    public T primero() {
        if(estaVacia()) {
            return null;
        }

        return primero.getData();
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        if(estaVacia()) {
            return null;
        }

        if(primero == atras) {
            atras = null;
        }

        T primerValor = primero.getData();
        primero = primero.getSiguiente();
        length--;
        return primerValor;
    }

    public void cola(T value) {
        Nodo<T> nuevoNodo = new Nodo<T>(value);
        if(estaVacia()) {
            primero = atras = nuevoNodo;
        } else {
            atras.setSiguiente(nuevoNodo);
            atras = nuevoNodo;
        }
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> nodoIterador = primero;
        while(nodoIterador != null){
            stackString += nodoIterador;
            nodoIterador = nodoIterador.getSiguiente();
        }
        return stackString;
    }
}