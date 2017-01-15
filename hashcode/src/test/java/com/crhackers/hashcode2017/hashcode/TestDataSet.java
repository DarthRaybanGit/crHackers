package com.crhackers.hashcode2017.hashcode;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestDataSet {

	@Test
	public void test() {

		
		assertTrue(siSovrappone(1, 1, 3, 3, 2, 2, 4, 4));
		assertTrue(siSovrappone(4, 5, 5, 6, 2, 5, 4, 6));
		assertFalse(siSovrappone(0, 0, 0, 1, 0, 2, 0, 3));
		assertFalse(siSovrappone(1, 0, 2, 1, 2, 2, 2, 3));
	}
	
	private boolean siSovrappone(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		return !(x3 > x2 || y3 > y2 || x1 > x4 || y1 > y4);  
	}

}
