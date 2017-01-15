package com.crhackers.hashcode2017.utility;

import java.util.ArrayList;
import java.util.List;

public class Utility {

	public static List<Integer[]> utility (int min, int max) {
		
		List<Integer[]> result = new ArrayList<Integer[]>();
		
		Integer[] utile = {min, 1};
		result.add(utile);
		utile[0] = 1;
		utile[1] = min;
		result.add(utile);
		
		List<Integer> fattori = fattorizza(min);
		
		
		
		return result;
	}
	
	private static List<Integer> fattorizza(int n) {
		List<Integer> fattori = new ArrayList<Integer>();
		int c = 2;
		while(n > 1) {
			if (n%c == 0) {
				fattori.add(c);
				n = n / c;
			}
			else {
				c++;
			}
		}
		return fattori;
	}
}
