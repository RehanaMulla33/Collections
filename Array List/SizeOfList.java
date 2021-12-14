package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SizeOfList {

	public static void main(String[] args) {

		List arrayList = new ArrayList();

		System.out.println("Before printing , the size of array list:" + arrayList.size());

		arrayList.add("Rehana");
		arrayList.add(1);
		arrayList.add(33.33);
		arrayList.add('R');
		arrayList.add("Rehana");
		arrayList.add(true);
		arrayList.add(false);

		System.out.println("After printing , the size of array list is:" + arrayList.size());

	}

}
