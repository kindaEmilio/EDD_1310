public class ListaSimplementeLigada<T> {
    private Nodo<T> tope;

    public ListaSimplementeLigada() {
        tope = null;
    }

    public boolean estaVacio() {
        return tope == null;
    }


    public int buscar(T valor) {
        int indexPosition = 0;
        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo != null){
            if(valor.equals(iteratorNodo.getDato())) {
                return indexPosition;
            }
            iteratorNodo = iteratorNodo.getSiguiente();
            indexPosition++;
        }
        return -1;
    }


    public int getTamanio() {
        int tamanio = 0;
        Nodo<T> aux = tope;

        while(aux != null) {
            aux = aux.getSiguiente();
            tamanio++;
        }
        return tamanio;
    }
    public T getValue(T valor) {
        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo != null){
            if(valor.equals(iteratorNodo.getDato())) {
                return iteratorNodo.getDato();
            }
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        return null;
    }

    public void ponerAlFinal(T valor) {
        if(estaVacio()) {
            Nodo<T> newNodo = new Nodo<>(valor);
            tope = newNodo;
            return;
        }

        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo.getSiguiente() != null){
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        Nodo<T> newNodo = new Nodo<>(valor);
        iteratorNodo.setSiguiente(newNodo);
    }

    public void ponerPrimero(T valor) {
        Nodo<T> newNodo = new Nodo<>(valor, tope);
        tope = newNodo;
    }

    public void addAfter(T referencia, T valor) {
        if(buscar(referencia) < 0) return;

        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo.getSiguiente() != null && !referencia.equals(iteratorNodo.getDato())){
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        Nodo<T> newNodo = new Nodo<>(valor, iteratorNodo.getSiguiente());
        iteratorNodo.setSiguiente(newNodo);
    }

    public void deleteAt(int index) {
        if(this.getTamanio() <= index || estaVacio() || index < 0) return;
        if(index == 0) {
            borrarPrimero();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNodo = null;
        Nodo<T> iteratorNodo = tope;

        while(iteratorNodo.getSiguiente() != null && indexPosition < index){
            prevNodo = iteratorNodo;
            iteratorNodo = iteratorNodo.getSiguiente();
            indexPosition++;
        }
        prevNodo.setSiguiente(iteratorNodo.getSiguiente());
    }

    public void borrarPrimero() {
        if(estaVacio()) return;
        tope = tope.getSiguiente();
    }

    public void borrarUltimo() {
        if(estaVacio()) return;
        if(getTamanio() == 1) {
            borrarPrimero();
            return;
        }
        Nodo<T> prevNodo = null;
        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo.getSiguiente() != null){
            prevNodo = iteratorNodo;
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        prevNodo.setSiguiente(null);
    }

    public void borrarValor(T borrar) {
        if(estaVacio()) return;
        Nodo<T> prevNodo = null;
        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo.getSiguiente() != null && !borrar.equals(iteratorNodo.getDato())){
            prevNodo = iteratorNodo;
            iteratorNodo = iteratorNodo.getSiguiente();
        }

        if(prevNodo != null) {
            prevNodo.setSiguiente(iteratorNodo.getSiguiente());
        } else {
            borrarPrimero();
        }
    }

    public void actualizar(T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;

        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo != null && !a_buscar.equals(iteratorNodo.getDato())){
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        if(iteratorNodo.getDato() != a_buscar) return;
        iteratorNodo.setDato(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNodo = tope;
        while(iteratorNodo != null){
            arrrayListString += iteratorNodo;
            iteratorNodo = iteratorNodo.getSiguiente();
        }
        return arrrayListString;
    }
}