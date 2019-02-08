package Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class quicksort_prueba {

	@Test
	public void test3() {
		
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
}