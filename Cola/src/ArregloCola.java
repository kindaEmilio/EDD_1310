public class ArregloCola<T> {
    private T[] queue;
    private int primero, cola, length;

    public ArregloCola(int size) {
        queue = (T[]) new Object[size];
        primero = cola = -1;
        length = 0;
    }

    public boolean estaVacio() {
        return primero == -1;
    }

    public int length() {
        return length;
    }

    public void enqueue(T element) throws Exception {
        if (!estaLleno()) {
            cola = mover(cola);
            if (estaVacio()) {
                primero++;
            }
            queue[cola] = element;
        }
        length++;
    }

    public T dequeue() {
        T elemento = null;
        if(!estaVacio()) {
            elemento = queue[primero];
            if (primero == cola) {
                primero = cola = -1;
            } else {
                primero = mover(primero);
            }
        }
        return elemento;
    }

    public T primero() {
        if (estaVacio()) {
            return null;
        }
        return queue[primero];
    }

    public boolean estaLleno() {
        return  mover(cola) == primero;
    }

    private int mover(int numero) {
        return (numero + 1) % queue.length;
    }

    public String toString() {
        String result = "";
        if (!estaVacio()) {
            int aux = primero;
            do {
                result += queue[aux] + " ";
                aux = mover(aux);
            } while (aux != mover(cola));
        } else {
            result += "null";
        }
        return result;
    }
}