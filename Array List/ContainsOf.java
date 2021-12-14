package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainsOf {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList();

		

		arrayList.add("Xorkz");
		arrayList.add("Rehana");
		arrayList.add(1);
		arrayList.add(33.33);
		arrayList.add('R');
		arrayList.add("Rehana");
		arrayList.add(true);
		arrayList.add(false);
		arrayList.add(234);
		arrayList.add(3456);

		System.out.println("Array contains en element  : " + arrayList.contains("Rehana"));

	}


	}


