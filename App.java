package coleccionsN1E2;
/*
Crea i emplena un List<Integer>. 

Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 

Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
	

	public static void main(String[] args) {
		
		List<Integer> llista1 = new ArrayList<Integer>();
		List<Integer> llista2 = new ArrayList<Integer>();
		
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		llista1.add(4);
		llista1.add(5);
		System.out.println(llista1);
		
		ListIterator<Integer> it = llista1.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		
		while(it.hasPrevious()) {
			llista2.add(it.previous());
		}
			  
		System.out.println(llista2);
	
		
	}
}
