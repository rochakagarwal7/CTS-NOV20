package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestProductSelection {

	public static void main(String[] args) {
		// Suppose user wants only Lenova, but ratings should be in sorted order
		List<Laptop> laptops = Laptop.fetchLaptops();
		// get only particular laptop and add to the collection
		List<Laptop> particularLaptops = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getBrandName().equals("Lenova"))
				particularLaptops.add(laptop);
		}
		// sort the particular laptop with ratings in sorted order
		Collections.sort(particularLaptops, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return Double.compare(o2.getRatings(), o1.getRatings());
			}
		});
		// iterate the sorted laptops
		for(Laptop laptop : particularLaptops) {
			System.out.println(laptop);
		}
	}

}
