public class Main {
    public static void main(String[] args) throws Exception {
        pilaNodo<Integer> nodeStack = new pilaNodo<>();
        System.out.println("Pila con nodos");
        System.out.println("estaVacia(): " + nodeStack.estaVacia());
        System.out.println("length(): " + nodeStack.length());
        System.out.println("push(1)");
        nodeStack.push(1);
        System.out.println("push(2)");
        nodeStack.push(2);
        System.out.println("push(3)");
        nodeStack.push(3);
        System.out.println(nodeStack);
        System.out.println("peek(): " + nodeStack.peek());
        System.out.println("pop(): " + nodeStack.pop());
        System.out.println(nodeStack);

        pilaArray<Integer> arrayStack = new pilaArray<>(5);
        System.out.println("Pila usando Array");
        System.out.println("isEmpty(): " + arrayStack.estaVacia());
        System.out.println("length(): " + arrayStack.length());
        System.out.println("push(1)");
        arrayStack.push(1);
        System.out.println("push(2)");
        arrayStack.push(2);
        System.out.println("push(3)");
        arrayStack.push(3);
        System.out.println("push(4)");
        arrayStack.push(4);
        System.out.println("push(5)");
        arrayStack.push(5);
        System.out.println("estaLlena(): " + arrayStack.estaLlena());
        System.out.println(arrayStack);
        System.out.println("peek(): " + arrayStack.peek());
        System.out.println("pop(): " + arrayStack.pop());
        System.out.println(arrayStack);
    }
}