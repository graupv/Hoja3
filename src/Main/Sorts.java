package Main;

public class Sorts {
    /*
    Clase que sus metodos son cada sort.
     */

    void gnome_sort(int[] n){
    // implementar el sort
    for (int i = 1; i <= array.length;){
        if (array[i - 1] <= array[i])
                ++i;

        else {
                int tempValue = array[i];
                array[i] = array[i - 1];
                array[i - 1] = tempValue;
                --i;

                if (i == 0)
                    i = 1;
            }
        }
        return array;
            

    }

    void radix_sort(int[] n){

    }

    void quick_sort(int[] n){

    }

    void merge_sort(int[] n){

    }

    void gravity_sort(int[] n){
    //  tambien llamado bead sort

    }

}
