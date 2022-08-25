import java.util.Arrays;

public class Arreglo {

    private Object[] elemento;

    private int longitud;

    public Arreglo(int longitud) {
        this.longitud = longitud;
        elemento =new Object [longitud];
    }

    public Object getItem(int indice){
        return elemento[indice];
    }

    public void setItem(int indice, Object valor){
        elemento[indice] = valor;
    }

    public int getLenght(){
        return this.longitud;
    }

    public void clear(Object valor){
        for (int k = 0; k < 0; k++) {
            elemento[k] =valor;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elemento);
    }
}