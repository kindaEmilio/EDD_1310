public class pilaArray<T> {
    private T[] pila;
    private int top;

    public pilaArray(int size) {
        pila = (T[]) new Object[size];
        top = -1;
    }

    public boolean estaVacia() {
        return top == -1;
    }

    public int length() {
        return top + 1;
    }

    public T pop() {
        if (estaVacia()) {
            return null;
        }
        T element = pila[top];
        top--;
        return element;
    }

    public T peek() {
        if (estaVacia()) {
            return null;
        }
        return pila[top];
    }


    public boolean estaLlena() {
        return top == pila.length - 1;
    }
    public void push(T element) throws Exception {
        if (estaLlena()) {
            throw new Exception("Error longitud maxima");
        }
        top++;
        pila[top] = element;
    }


    public String toString() {
        String stackString = "";
        for (int i = 0; i <= top; i++) {
            stackString += pila[i] + " -> ";
        }
        return stackString;
    }
}