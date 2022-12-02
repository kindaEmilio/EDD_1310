public class Main {
    public static void main(String[] args) {
        Hash<String, String> hash = new Hash<>(4);
        hash.aniadir("Yo", "Wapo");
        hash.aniadir("Rayo", "Mcqueen");
        hash.aniadir("Marco", "Polo");
        hash.aniadir("Chocolate", "Vainilla");

        System.out.println(hash.valorDe("Yo"));
        System.out.println(hash.valorDe("Rayo"));
        System.out.println(hash.valorDe("Marco"));

        hash.quitar("Chocolate");
        System.out.println(hash.valorDe("Chocolate"));

        hash.aniadir("Chocolate", "Vainilla");
        System.out.println(hash.valorDe("Chocolate"));
    }
}