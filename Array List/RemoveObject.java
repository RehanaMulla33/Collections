package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveObject {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList();

		System.out.println("Before adding element : " + arrayList.isEmpty());

		arrayList.add("Xorkz");
		arrayList.add("Rehana");
		arrayList.add(1);
		arrayList.add(33.33);
		arrayList.add('R');
		arrayList.add("Rehana");
		arrayList.add(true);
		arrayList.add(false);
		

		System.out.println("After removing 4th element of an array list : " + arrayList.remove(4));


	}

}
