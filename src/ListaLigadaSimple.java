public class ListaLigadaSimple<T> {
    private Nodo<T> head;

    public ListaLigadaSimple() {
        head = null;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public void borrarUltimo() {
        if(estaVacia()) return;
        if(getSize() == 1) {
            borrarInicio();
            return;
        }
        Nodo<T> prevNodo = null;
        Nodo<T> iteratorNodo = head;
        while(iteratorNodo.getNext() != null){
            prevNodo = iteratorNodo;
            iteratorNodo = iteratorNodo.getNext();
        }
        prevNodo.ponerSiguiente(null);
    }

    public int getSize() {
        int size = 0;
        Nodo<T> aux = head;

        while(aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public int buscar(T valor) {
        int indexPosition = 0;
        Nodo<T> iteratorNodo = head;
        while(iteratorNodo != null){
            if(iteratorNodo.getData() == valor) {
                return indexPosition;
            }
            iteratorNodo = iteratorNodo.getNext();
            indexPosition++;
        }
        return -1;
    }

    public void agregarUltimo(T valor) {
        if(estaVacia()) {
            Nodo<T> newNodo = new Nodo<>(valor);
            head = newNodo;
            return;
        }

        Nodo<T> iteradorNodo = head;
        while(iteradorNodo.getNext() != null){
            iteradorNodo = iteradorNodo.getNext();
        }
        Nodo<T> newNodo = new Nodo<>(valor);
        iteradorNodo.ponerSiguiente(newNodo);
    }

    public void agregarPrimero(T valor) {
        Nodo<T> newNodo = new Nodo<>(valor, head);
        head = newNodo;
    }

    public void agregarDespues(T referencia, T valor) {
        if(buscar(referencia) < 0) return;

        Nodo<T> iteratorNodo = head;
        while(iteratorNodo.getNext() != null && iteratorNodo.getData() != referencia){
            iteratorNodo = iteratorNodo.getNext();
        }
        Nodo<T> newNodo = new Nodo<>(valor, iteratorNodo.getNext());
        iteratorNodo.ponerSiguiente(newNodo);
    }

    public void borrarEn(int index) {
        if(this.getSize() <= index || estaVacia() || index < 0) return;
        if(index == 0) {
            borrarInicio();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNodo = null;
        Nodo<T> iteradorNodo = head;

        while(iteradorNodo.getNext() != null && indexPosition < index){
            prevNodo = iteradorNodo;
            iteradorNodo = iteradorNodo.getNext();
            indexPosition++;
        }
        prevNodo.ponerSiguiente(iteradorNodo.getNext());
    }

    public void borrarInicio() {
        if(estaVacia()) return;
        head = head.getNext();
    }

    public void refresh(T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;

        Nodo<T> iteradorNodo = head;
        while(iteradorNodo != null && iteradorNodo.getData() != a_buscar){
            iteradorNodo = iteradorNodo.getNext();
        }
        if(iteradorNodo.getData() != a_buscar) return;
        iteradorNodo.setData(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNodo = head;
        while(iteratorNodo != null){
            arrrayListString += iteratorNodo;
            iteratorNodo = iteratorNodo.getNext();
        }
        return arrrayListString;
    }
}