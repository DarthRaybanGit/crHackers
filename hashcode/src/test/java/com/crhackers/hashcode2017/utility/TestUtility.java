package com.crhackers.hashcode2017.utility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUtility extends TestCase {

	@Test
	public void testUtility(){
		List<Integer[]> res = Utility.utility(8, 12);
		assertEquals(19, res.size());
		res.clear();
		
		res = Utility.utility(6, 10);
		assertEquals(17, res.size());
	}
}
