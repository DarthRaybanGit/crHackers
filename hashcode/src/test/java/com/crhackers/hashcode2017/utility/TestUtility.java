package com.crhackers.hashcode2017.utility;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUtility extends TestCase {

	@Test
	public void testUtility(){
		List<Integer[]> res = Utility.calculateRectangle(8, 12);
		assertEquals(19, res.size());
		res.clear();
		
		res = Utility.calculateRectangle(6, 10);
		assertEquals(17, res.size());
		
		res = Utility.calculateRectangle(2, 5);
		for(Integer[] a: res){
			System.out.println(a[0] + " " + a[1]);
		}
	}
}
