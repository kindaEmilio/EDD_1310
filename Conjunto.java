import java.util.ArrayList;

public class Conjunto<T> implements Iterable<T>{
    ArrayList<T> datos = new ArrayList<>();

    public int largo() {
        return datos.size();
    }

    public boolean contains(T value) {
        return datos.indexOf(value) != -1;
    }

    public void agregar(T value) {
        if(!contains(value)) {
            datos.add(value);
        }
    }

    public void quitar(T value) {
        datos.remove(value);
    }

    public boolean equals(Conjunto<T> other) {
        if(largo() != other.largo()) {
            return false;
        }
        for(int i = 0; i < largo(); i++) {
            if(!other.contains(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubConjunto(Conjunto<T> other) {
        if(largo() > other.largo()){
            return false;
        }
        for(int i = 0; i < largo(); i++) {
            if(!other.contains(datos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void union(Conjunto<T> other) {
        for(int i = 0; i < other.largo(); i++) {
            agregar(other.datos.get(i));
        }
    }

    public Conjunto<T> interseccion(Conjunto<T> other) {
        Conjunto<T> result = new Conjunto();
        for(int i = 0; i < largo(); i++) {
            if(other.contains(datos.get(i))) {
                result.agregar(datos.get(i));
            }
        }
        return result;
    }

    public Conjunto<T> diferencia(Conjunto<T> other) {
        Conjunto<T> result = new Conjunto();
        for(int i = 0; i < largo(); i++) {
            if(!other.contains(datos.get(i))) {
                result.agregar(datos.get(i));
            }
        }
        for(int i = 0; i < other.largo(); i++) {
            if(!contains(other.datos.get(i))) {
                result.agregar(other.datos.get(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return datos.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < datos.size();
            }

            @Override
            public T next() {
                return datos.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}