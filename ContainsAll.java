package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;


public class ContainsAll {

	public static void main(String[] args) {
		List arrayList1 = new ArrayList();

		arrayList1.add("DBMS");
		arrayList1.add("JAVA");
		arrayList1.add("Operating System");
		arrayList1.add("Digital Electronics");
		arrayList1.add("Sotware Engg");
		arrayList1.add("Network System");
		arrayList1.add("Algorith");
		arrayList1.add("C++");
		
		List arrayList2=new ArrayList();
		
		arrayList2.add("DBMS");
		arrayList2.add("JAVA");
		arrayList2.add("Operating System");
		System.out.println(arrayList1.size());
		System.out.println(arrayList2.containsAll(arrayList1));
		
		
		
		
		
		
		
		
		
		
		


	}

}
