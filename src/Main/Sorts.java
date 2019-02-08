package Main;

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

    void radix_sort(int[] n){
      /*static void radixsort(int arr[], int n){

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


*/
   

    }

    void quick_sort(int[] n){

    }

    void merge_sort(int[] n){

    }

    void gravity_sort(int[] n){
    //  tambien llamado bead sort

    }

}
