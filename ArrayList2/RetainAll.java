package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {
		Collection arrayList = new ArrayList();

		arrayList.add("DBMS");
		arrayList.add("JAVA");
		arrayList.add("Operating System");
		arrayList.add("Digital Electronics");
		arrayList.add("Sotware Engg");
	
		
		Collection arrayList1=new ArrayList();
		
		arrayList1.add("DBMS");
		arrayList1.add("JAVA");
		
		System.out.println(arrayList.size());
		arrayList.retainAll(arrayList1);
		System.out.println(arrayList.size());
	}

}
