package com.Xworkz.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList();

		arrayList.add("Water Heater");
		arrayList.add("Pen");
		arrayList.add("laptop");
		arrayList.add(33.33);
		arrayList.add('R');
		arrayList.add("Highlighter");
		arrayList.add(true);
		arrayList.add(false);
		arrayList.add(234);
		arrayList.add(3456);

		System.out.println("Index of an element is : " + arrayList.indexOf("Highlighter"));

	}

	}


