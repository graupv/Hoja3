package Pruebas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class gnome_sortPrueba {

	@Test
	public void test1() {
		Sorts ob = new Sorts();
		
		 int arr[] = { 34, 2, 10, -9 }; 
		  
	       ob.gnome_sort(arr);
	  
	        System.out.print("Sorted sequence after applying Gnome sort: "); 
	        System.out.println(Arrays.toString(arr)); 
	
		 
		
	}

}
