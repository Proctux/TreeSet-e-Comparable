package application;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("TV", 900.00));
		set.add(new Product("Tablet", 560.00));
		
		for(Product p : set) {
			System.out.println(p);
		}
		
		
	}

}
