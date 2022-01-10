package com.coderscampus7.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<Integer> cal = new CustomArrayList<Integer>();
		
		/*
		for(int i=0;i<100;i++) {
			cal.add("element " + i);
		}
		
		for (int i=0; i<cal.getSize(); i++) {
			System.out.println(cal.get(i));
		}
		*/
		
		for(int i=0;i<10;i++) {
			cal.add(i);
		}
		
		cal.add(5, 1);
		
		for (int i=0; i<cal.getSize(); i++) {
			System.out.println(cal.get(i));
		}
		
	}

}
