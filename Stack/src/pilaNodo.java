public class pilaNodo<T> {
    private Nodo<T> top;
    private int length;

    public pilaNodo() {
        top = null;
        length = 0;
    }

    public boolean estaVacia() {
        return top == null && length == 0;
    }

    public T pop() {
        if(estaVacia()) {
            return null;
        }

        T topValue = top.getData();
        top = top.getSiguiente();
        length--;
        return topValue;
    }
    public int length() {
        return length;
    }


    public T peek() {
        if(estaVacia()) {
            return null;
        }

        return top.getData();
    }

    public void push(T value) {
        Nodo<T> newNode = new Nodo<T>(value);
        newNode.setSiguiente(top);
        top = newNode;
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> nodoIterador = top;
        while(nodoIterador != null){
            stackString += nodoIterador;
            nodoIterador = nodoIterador.getSiguiente();
        }
        return stackString;
    }
}