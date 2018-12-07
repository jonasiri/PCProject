/**
 * 
 */
package computersPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author 40020788
 *
 */
public class MakeAPC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Tower t1 = new Tower("Alienware 1.0", 8, 128, 1.4, 600, 3); 
		Laptops l1 = new Laptops("Predator", 16, 256, 2.8, 156, 3); 
		Tower t2 = new Tower("Alienware 2.0", 12, 256, 3.4, 800, 4); 
		Tower t3 = new Tower("HP ShitShow", 8, 512, 2.1, 1200, 6);
		Tower t4 = new Tower("HP Waah", 12, 512, 3.9, 5000, 6); 
		Laptops l2 = new Laptops("Razer Blade", 16, 1024, 3.8, 18, 5); 
		Laptops l3 = new Laptops("Alienware shitbook", 8, 128, 1.9, 14.8, 2); 
		Laptops l4 = new Laptops("China WOO", 32, 2048, 5.9, 87, 4); 
		
		Computer [] allPCs = {t1, t2, t3, t4, l1,l2,l3,l4}; 
		
		
		displayPCs(allPCs);
		sortHDD(allPCs);
	}
	
	public static void displayPCs(Computer [] allPCs) {
		for (Computer loop:allPCs) {
			loop.displayAll();
		}
	}
	
	public static void sortHDD(Computer [] allPCs) {
		ArrayList<Integer> hDDs = new ArrayList<Integer>(); 
		for (Computer hDD: allPCs) {
			hDDs.add(hDD.gethDD()); 
		}
		Collections.sort(hDDs, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(hDDs.toArray()));
	}

}
