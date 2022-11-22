public class ColaNodo<T> {
    private Nodo<T> primero;
    private Nodo<T> back;
    private int length;

    public boolean estaVacio() {
        return primero == null && length == 0;
    }

    public int length() {
        return length;
    }

    public void enqueue(T value) {
        Nodo<T> newNodo = new Nodo<T>(value);
        if(estaVacio()) {
            primero = back = newNodo;
        } else {
            back.setNext(newNodo);
            back = newNodo;
        }
        length++;
    }

    public T dequeue() {
        if(estaVacio()) {
            return null;
        }

        if(primero == back) {
            back = null;
        }

        T topValue = primero.getData();
        primero = primero.getNext();
        length--;
        return topValue;
    }

    public ColaNodo() {
        primero = back = null;
        length = 0;
    }

    public T front() {
        if(estaVacio()) {
            return null;
        }

        return primero.getData();
    }

    @Override
    public String toString() {
        String texto = "";
        Nodo<T> nodoIterador = primero;
        while(nodoIterador != null){
            texto += nodoIterador;
            nodoIterador = nodoIterador.getNext();
        }
        return texto;
    }
}