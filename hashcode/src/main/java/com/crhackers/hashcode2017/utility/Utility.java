package com.crhackers.hashcode2017.utility;

import java.util.ArrayList;
import java.util.List;

public class Utility {

	public static List<Integer[]> utility (int min, int max) {
		List<Integer[]> res = new ArrayList<Integer[]>();
		for(int i = min; i<=max; i++){
			for(int j = 1; j<=i; j++){
				int righe = j;
				int colonne = i-j+1;
				
				while(righe*colonne > i)
					colonne--;
				
				if(righe * colonne == i){
					Integer a1[] = {righe, colonne};
					res.add(a1);
					System.out.println(i + ": " + a1[0] + " " + a1[1]);
				}	
			}
		}
		return res;
	}
}
