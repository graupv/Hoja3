package Main;

public class Numeros implements Comparable<Numeros> {
    /*
    Estructura de datos que implementa Comparable.
    Generic es si mismo para permitir comparar entre objetos
    de la misma ADT/clase.
     */

    int val;
    Numeros(int n){
        this.val = Math.abs(n);
    }

    public int compareTo(Numeros n) {

        if (this.val == n.val){
            return 0;
        } else if (this.val > n.val){
            return 1;
        } else {
            return -1;
        }
    }
}
