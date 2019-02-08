package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class merge_sort_prueba {

	@Test
	public void test4() {
		
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
	}



