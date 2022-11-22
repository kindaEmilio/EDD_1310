public class Main {
    public static void main(String[] args) throws Exception {

        ColaNodo<Integer> colaNodo = new ColaNodo<>();

        System.out.println("colaNodo");

        System.out.println("estaVacio: " + colaNodo.estaVacio());

        System.out.println("cola(1)");

        colaNodo.enqueue(1);

        System.out.println("cola(2)");

        colaNodo.enqueue(2);

        System.out.println("cola(3)");

        colaNodo.enqueue(3);

        System.out.println(colaNodo);

        System.out.println("largo: " + colaNodo.length());

        System.out.println("estaVacia: " + colaNodo.estaVacio());

        System.out.println("primero: " + colaNodo.front());

        System.out.println("dequeue: " + colaNodo.dequeue());

        System.out.println("dequeue: " + colaNodo.dequeue());

        System.out.println("dequeue: " + colaNodo.dequeue());
        
        System.out.println("estaVacia: " + colaNodo.estaVacio());


        ArregloCola<Integer> arrayQueue = new ArregloCola<>(5);

        System.out.println("ArregloCola");

        System.out.println("estaVacia: " + arrayQueue.estaVacio());

        System.out.println("cola(1)");

        arrayQueue.enqueue(1);

        System.out.println("cola(2)");

        arrayQueue.enqueue(2);

        System.out.println("cola(3)");

        arrayQueue.enqueue(3);

        System.out.println(arrayQueue);

        System.out.println("largo: " + arrayQueue.length());

        System.out.println("estaVacia: " + arrayQueue.estaVacio());

        System.out.println("primero: " + arrayQueue.primero());

        System.out.println("dequeue: " + arrayQueue.dequeue());

        System.out.println("dequeue: " + arrayQueue.dequeue());


        System.out.println("dequeue: " + arrayQueue.dequeue());

        System.out.println("estaVacia: " + arrayQueue.estaVacio());

    }
}