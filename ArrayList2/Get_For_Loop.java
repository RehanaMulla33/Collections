package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Get_For_Loop {

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
		
		for(int i=0; i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}

	}

}
