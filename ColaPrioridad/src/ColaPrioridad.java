public class ColaPrioridad<T> {
    private ColaNodo<T>[] colapri;
    private int tamanio, length;

    public ColaPrioridad(int tamanio) {
        colapri = new ColaNodo[tamanio];
        this.tamanio = tamanio;
        length = 0;
    }

    public T dequeue() {
        if(estaVacio()) {
            return null;
        }

        for(int i = 0; i < tamanio; i++) {
            if(colapri[i] != null && !colapri[i].estaVacia()) {
                length--;
                return colapri[i].dequeue();
            }
        }

        return null;
    }

    public boolean estaVacio() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void cola(int prioridad, T valor) {
        if(prioridad < 0 && prioridad >= tamanio) {
            throw new IllegalArgumentException("el velor debe estar entre 0 y " + (tamanio - 1));
        }

        if(colapri[prioridad] == null) {
            colapri[prioridad] = new ColaNodo<T>();
        }

        colapri[prioridad].cola(valor);
        length++;
    }

    public T front() {
        if(estaVacio()) {
            return null;
        }

        for(int i = 0; i < tamanio; i++) {
            if(colapri[i] != null && !colapri[i].estaVacia()) {
                return colapri[i].primero();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String queueString = "";
        for(int i = 0; i < tamanio; i++) {
            queueString += i + ": ";
            if (colapri[i] != null && !colapri[i].estaVacia()) {
                queueString += colapri[i] + "\n";
            } else {
                queueString += "null\n";
            }
        }
        return queueString;
    }
}