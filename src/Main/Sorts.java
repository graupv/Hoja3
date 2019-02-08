package Main;

import java.util.*;

public class Sorts {
    /*
    Clase que sus metodos son cada sort.
     */

    int[] gnome_sort(int[] array){
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

    void radixsort(int[] arr, int n){

        int m = Maximo(arr, n);
        for (int exp = 1; m/exp > 0; exp *= 10)
            contar(arr, n, exp);
    }
    
        static void contar(int arr[], int n, int exp){

            int out[] = new int[n];
            int i;
            int contar1[] = new int[10];
            Arrays.fill(contar1,0);


            for (i = 0; i < n; i++)
                contar1[ (arr[i]/exp)%10 ]++;


            for (i = 1; i < 10; i++)
                contar1[i] += contar1[i - 1];

            for (i = n - 1; i >= 0; i--)
            {
                out[contar1[ (arr[i]/exp)%10 ] - 1] = arr[i];
                contar1[ (arr[i]/exp)%10 ]--;
            }


            for (i = 0; i < n; i++)
                arr[i] = out[i];
        }
 
    

        static int Maximo(int arr[], int n)
        {
            int mx = arr[0];
            for (int i = 1; i < n; i++)
                if (arr[i] > mx)
                    mx = arr[i];
            return mx;
        }



    void quicksort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int i = partition(arr, low, high);

            // Recursivamente
            quicksort(arr, low, i-1);
            quicksort(arr, i + 1, high);
        }
    }

    void merge_sort(int[] n, int temp[], int low, int mid, int high){
        //  n == top half
        //  temp == bottom half
        int res_ind = low;
        int temp_ind = low;
        int dest = mid;

        while (temp_ind < mid && dest <= high){
            //  iterar ambos arreglos
            if (n[dest] < temp[temp_ind]){
                n[res_ind++] = n[dest++];
                //
            } else {
                n[res_ind++] = temp[temp_ind++];
            }
        }
        while (temp_ind < mid){
            // mientras no se ha llegado a la mitad
            n[res_ind++] = temp[temp_ind++];
        }
    }

    void gravity_sort(int[] n){
    //  tambien llamado bead sort

    }

    static int partition(int arr[], int low, int high){
        // metodo para separar
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            //
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
