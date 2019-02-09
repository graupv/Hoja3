//package Main;

import static org.junit.Assert.*;

public class SortsTest {

    @org.junit.Test
    public void contar() {
        Sorts ob = new Sorts();
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = arr.length; 
        ob.radixsort(arr, n);
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    }

    @org.junit.Test
    public void maximo() {
        Sorts ob = new Sorts();
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = arr.length; 
        ob.radixsort(arr, n);
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    
    }

    @org.junit.Test
    public void quicksort() {
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        Sorts ob = new Sorts(); 
        ob.quicksort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        
        int n2 = arr.length; 
        for (int i=0; i<n2; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }

    @org.junit.Test
    public void merge_sort() {
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        int temp[] = null;
 
        int n = arr.length; 

        Sorts ob = new Sorts(); 
        ob.merge_sort(arr, temp, n, n, n);
  
        System.out.println("\nSorted array"); 
        int n2 = arr.length; 
        for (int i=0; i<n2; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }

    @org.junit.Test
    public void bubbleSort() {
        Sorts ob = new Sorts(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        
        
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
}