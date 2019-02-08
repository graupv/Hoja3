package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class bubble_sort_prueba {

	@Test
	public void test() {
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
