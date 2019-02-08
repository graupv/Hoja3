package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class radixsort_prueba {

	@Test
	public void test2() {
		Sorts ob = new Sorts();
		int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = arr.length; 
        ob.radixsort(arr, n);
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
	}

}
