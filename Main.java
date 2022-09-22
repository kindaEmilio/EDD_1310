public class Main {
    public static void main(String[] args) {
        Conjunto<Integer> conjunto1 = new Conjunto();
        Conjunto<Integer> conjunto_2 = new Conjunto();

        // agregar
        conjunto1.agregar(0);
        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);
        conjunto1.agregar(4);
        conjunto_2.agregar(3);
        conjunto_2.agregar(4);
        conjunto_2.agregar(5);
        conjunto_2.agregar(6);
        conjunto_2.agregar(7);

        System.out.println("largo de c1: " + conjunto1.largo());
        System.out.println("largo de c2: " + conjunto_2.largo());

        // union
        conjunto1.union(conjunto_2);
        System.out.println("c1 y c2: " + conjunto1);

        // interseccion
        Conjunto<Integer> conjunto_intersection = conjunto1.interseccion(conjunto_2);
        System.out.println("intersection c1 c2 " + conjunto_intersection);

        // diferencia
        Conjunto<Integer> conjunto_difference = conjunto1.diferencia(conjunto_2);
        System.out.println("difference c1 c2 " + conjunto_difference);

        // contains
        System.out.println("c1 contiene 0 " + conjunto1.contains(0));
        System.out.println("c1 contiene 5 " + conjunto1.contains(5));

        // quitar
        conjunto1.quitar(0);

        // igual
        System.out.println("c1 == c2 " + conjunto1.equals(conjunto_2));

        // es SubConjunto
        System.out.println("c1 subset c2 " + conjunto1.esSubConjunto(conjunto_2));

    }
}