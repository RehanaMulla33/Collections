package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class AddAll {

	public static void main(String[] args) {
		Collection arrayList = new ArrayList();

		arrayList.add("DBMS");
		arrayList.add("JAVA");
		arrayList.add("Operating System");
		arrayList.add("Digital Electronics");
		arrayList.add("Sotware Engg");
	
		
		Collection arrayList1=new ArrayList();
		
		arrayList1.add("Network System");
		arrayList1.add("Algorith");
		
		System.out.println(arrayList1.size());
		arrayList1.addAll(arrayList);
		System.out.println(arrayList1.size());

		
	}

}
