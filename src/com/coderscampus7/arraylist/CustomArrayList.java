package com.coderscampus7.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	@Override
	public boolean add(T item) {
		Boolean done = false;
		Boolean added = false;
		while(!done) {
			for (int i=0; i<=items.length; i++) {
				if(i == items.length) {
					// resize items [] and add new element here
					items = Arrays.copyOf(items, items.length*2);
					items[i] = item;
					added = true;
					done = true;
					break;
				}
				else if (items[i] != null) {
					continue;
				}
				else if (items[i] == null) {
					items[i] = item;
					added = true;
					done = true;
					break;
				}
				//else if (item.getClass() != items.getClass()) {
				//	done = true;
				//	break;
				//}
			}
		}
		return added;
	}
	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		Boolean done = false;
		Boolean added = false;
		
		while(!done) {
			if(index == items.length-1) {
				items = Arrays.copyOf(items, items.length*2);
			}
			else if (items[index] == null) {
				items[index] = item;
				added = true;
				done = true;
			}
			else {
				if (items[items.length-1] != null) {
					items = Arrays.copyOf(items, items.length*2);
				}
				
				Object [] temp = Arrays.copyOf(items, items.length);
				
				for (int i=0; i<index; i++) {
						temp[i] = items[i];
				}
				
				temp[index] = item;
				
				for (int j=index+1; j<temp.length; j++) {
					temp[j] = items[j-1];
				}
				items = temp;
				added = true;
				done = true;
			}	
		}
		return added;
	}
	
	@Override
	public int getSize() {
		int count = 0;
		for (int i=0; i<items.length; i++) {
			if (items[i] != null) {
				count++;
			}
			else {
				break;
			}
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException{
		T result = (T) items[index];
		//for (int i=0; i<items.length; i++) {
			//if (i == index) {
				//result = (T) items[index];
			//}
			//else {
			//	continue;
			//}
		//}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException{
		T result = (T) items[index];
		for (int i=0; i<items.length; i++) {
			if (i == index) {
				Object [] temp = Arrays.copyOf(items, items.length);
				for (int j=0; j<index; j++) {
						temp[i] = items[i];
				}
				temp[index] = null;
				for (int k=index+1; k<temp.length; k++) {
					temp[k-1] = items[k];
				}
				items = temp;
			}	
		}
		return result;
	}
	
}