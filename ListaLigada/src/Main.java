public class Main {
    public static void main(String[] args) {
        ListaLigadaSimple<Integer> listaLigada = new ListaLigadaSimple<>();
        System.out.println(listaLigada);

        // Lista Vacia
        System.out.println("\n¿La lista está vacía?");
        System.out.println(listaLigada.estaVacia());

        // Tamaño
        System.out.println("\nTamaño de la lista");
        System.out.println(listaLigada.getSize());

        // Agregar al inicio
        System.out.println("\nAgrega 1 al inicio");
        listaLigada.agregarPrimero(1);
        System.out.println(listaLigada);
        System.out.println("Agrega 2 al inicio");
        listaLigada.agregarPrimero(2);
        System.out.println(listaLigada);
        System.out.println("Agrega 3 al inicio");
        listaLigada.agregarPrimero(3);
        System.out.println(listaLigada);

        // Agregar al final
        System.out.println("\nAgrega 0 al final");
        listaLigada.agregarUltimo(0);
        System.out.println(listaLigada);

        // Agregar despues de
        System.out.println("\nAgregar 8 despues de 1");
        listaLigada.agregarDespues(1, 8);
        System.out.println(listaLigada);

        // Remplaza el 0 a -1
        System.out.println("\nRemplaza el 0 a -1");
        listaLigada.refresh(0, -1);
        System.out.println(listaLigada);

        // Remplaza el 8 a 0
        System.out.println("\nRemplaza el 8 a 0");
        listaLigada.refresh(8, 0);
        System.out.println(listaLigada);

        // Elimina en la posicion
        System.out.println("\nElimina en la posicion 2");
        listaLigada.borrarEn(1);
        System.out.println(listaLigada);

        // Elimina el primer valor
        System.out.println("\nElimina primer valor");
        listaLigada.borrarInicio();
        System.out.println(listaLigada);

        // Elimina el último valor
        System.out.println("\nElimina el último valor");
        listaLigada.borrarUltimo();
        System.out.println(listaLigada);

        // Busca el valor
        System.out.println("\nBusca el 1");
        System.out.println("Resultado: " + listaLigada.buscar(1));
    }
}