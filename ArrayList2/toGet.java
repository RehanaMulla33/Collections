package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class toGet {

	public static void main(String[] args) {
		List arrayList = new ArrayList();

		arrayList.add("DBMS");
		arrayList.add("JAVA");
		arrayList.add("Operating System");
		arrayList.add("Digital Electronics");
		arrayList.add("Sotware Engg");
		arrayList.add("Network System");
		arrayList.add("Algorith");
		arrayList.add("C++");
		
		for(Object object:arrayList) {
			System.out.println(object);
		}
		
		Object object=arrayList.get(5);
		System.out.println(object);

	}

}
