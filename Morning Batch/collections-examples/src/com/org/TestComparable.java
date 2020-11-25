package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		for(Items item : list) {
			System.out.println(item);
		}
		System.out.println("---- Sorting ----");
		Collections.sort(list);
		for(Items item : list) {
			System.out.println(item);
		}
	}

}
