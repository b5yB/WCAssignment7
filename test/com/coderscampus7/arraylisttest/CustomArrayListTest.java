package com.coderscampus7.arraylisttest;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus7.arraylist.CustomArrayList;
import com.coderscampus7.arraylist.CustomList;

class CustomArrayListTest {
	//write failing test
	//write business logic to pass test
	//Re-factor code
	//Three a's - arrange, act, assert

	@Test
	void should_add_one_item_to_list() {
		//arrange
		CustomList<Integer> cl = new CustomArrayList<Integer>();
		
		//act
		cl.add(10);
	
		//assert
		assertEquals(10, cl.get(0));
		assertEquals(1, cl.getSize());
		assertTrue(cl.add(10));
		
	}
	
	@Test
	void should_add_one_item_to_list_at_index() {
		CustomList<Integer> cl = new CustomArrayList<Integer>();
	
		cl.add(10);
		cl.add(12);
		cl.add(1, 11);
				
		assertEquals(11, cl.get(1));
		assertEquals(12, cl.get(2));
		assertEquals(3, cl.getSize());
		assertTrue(cl.add(0, 10));
		assertThrows(IndexOutOfBoundsException.class, () -> {cl.add(10, 10);});
		
	}
	
	@Test
	void should_return_size_of_list() {
		CustomList<Integer> cl = new CustomArrayList<Integer>();
		
		assertEquals(0, cl.getSize());
		
		cl.add(10);
		
		assertEquals(1, cl.getSize());
		
	}
	
	@Test
	void should_return_element_from_list() {
		CustomList<Integer> cl = new CustomArrayList<Integer>();
		
		cl.add(10);
		cl.add(11);
				
		assertEquals(10, cl.get(0));
		assertEquals(11, cl.get(1));
		assertThrows(IndexOutOfBoundsException.class, () -> {cl.get(10);});
		
	}
	
	@Test 
	void should_remove_element_from_list() {
		CustomList<Integer> cl = new CustomArrayList<Integer>();
		
		cl.add(10);
		cl.add(11);
		cl.add(12);
		
		assertEquals(11, cl.remove(1));
		assertEquals(12, cl.get(1));
		assertEquals(2, cl.getSize());
		assertThrows(IndexOutOfBoundsException.class, () -> {cl.remove(10);});

		
	}

}
