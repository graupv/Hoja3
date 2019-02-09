package Main;

/*
Gerardo Pineda 18848
Sara Zavala 18893
Estuardo Ureta
Estructuras de Datos
Numeros.java
Clase donde se utiliza CompareTo
*/
public class Numeros implements Comparable<Numeros> {

    /*
    Comparable<T>
    Estructura de datos que implementa Comparable.
    Generic es si mismo para permitir comparar entre objetos
    de la misma ADT/clase.
    Esto ya es implementado por otras clases como Integer, etc.
     */

    int val;
    Numeros(int n){
        this.val = Math.abs(n);
    }

    public int compareTo(Numeros n) {

        if (this.val == n.val){
            return 0;
            // this > that
        } else if (this.val > n.val){
            return 1;
        } else {
            return -1;
        }
    }
}
