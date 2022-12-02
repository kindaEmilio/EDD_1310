public class Hash<K, V> {
    private class Uno {
        public K llave;
        public V valor;
        public int hash;

        public Uno(K llave, V valor) {
            this.llave = llave;
            this.valor = valor;
            this.hash = llave.hashCode();
        }

        @Override
        public boolean equals(Object otherEntry) {
            Uno other = (Uno) otherEntry;
            if(this.hash != other.hash) return false;
            return this.llave.equals(other.llave);
        }
    }

    private ListaSimplementeLigada<Uno>[] entrada;
    private int tamanio;

    private int normalizeIndex(int llaveHash) {
        return (llaveHash & 0x7FFFFFFF) % tamanio;
    }

    public void aniadir(K key, V value) {
        Uno entrada = new Uno(key, value);
        int indice = normalizeIndex(entrada.hash);
        if (this.entrada[indice] == null) {
            this.entrada[indice] = new ListaSimplementeLigada<>();
            this.entrada[indice].ponerPrimero(entrada);
        } else {
            if (this.entrada[indice].buscar(entrada) >= 0) {
                this.entrada[indice].actualizar(entrada, entrada);
            } else {
                this.entrada[indice].ponerPrimero(entrada);
            }
        }
    }

    public void quitar(K indentificador) {
        Uno aux = new Uno(indentificador, null);
        int bucketIndex = normalizeIndex(indentificador.hashCode());
        entrada[bucketIndex].borrarValor(aux);
    }

    public Hash(int tamanio) {
        this.tamanio = tamanio;
        this.entrada = new ListaSimplementeLigada[tamanio];
        for(int i = 0; i < tamanio; i++) {
            entrada[i] = new ListaSimplementeLigada<>();
        }
    }

    public V valorDe(K identificador) {
        int bucketIndex = normalizeIndex(identificador.hashCode());
        if (entrada[bucketIndex] == null || entrada[bucketIndex].estaVacio()) return null;
        Uno uno = new Uno(identificador, null);
        Uno index = entrada[bucketIndex].getValue(uno);
        if (index == null) return null;
        return index.valor;
    }

}