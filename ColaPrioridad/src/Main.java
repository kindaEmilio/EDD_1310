public class Main {
    public static void main(String[] args) throws Exception {
        ColaPrioridad<String> queue = new ColaPrioridad<String>(7);
        queue.cola(4, "Maestro");
        queue.cola(2, "Niños");
        queue.cola(4, "Mecanico");
        queue.cola(3, "Hombres");
        queue.cola(4, "Vigia");
        queue.cola(5, "Capitan");
        queue.cola(4, "Timonel");
        queue.cola(3, "Mujeres");
        queue.cola(2, "3ra edad");
        queue.cola(1, "Niñas");
    }
}