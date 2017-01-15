package com.crhackers.hashcode2017.hashcode;

import java.util.List;

public class DataSet {
	private final int ROW;
	private final int COL;
	private final int L;
	private final int H;
	private final String[][] PIZZA;
	private final List<Integer[]> RECT;
	
	public DataSet(DataSetBuilder builder) {
		ROW = builder.row;
		COL = builder.col;
		L = builder.low;
		H = builder.high;
		PIZZA = builder.pizza;
		RECT = builder.rect;
	}
	
	private boolean isMushrooms(String el){
		return el.equalsIgnoreCase("M");
	}
	
	private boolean isTomato(String el){
		return el.equalsIgnoreCase("T");
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("- - - - - - HEADER - - - - - - \n");
		res.append(ROW + " " + COL + " " + L + " " + H + "\n");
		res.append("- - - - - - PAYLOAD - - - - - - \n");
		for(String line[]: PIZZA){
			for(String ch: line){
				res.append(ch + " ");
			}
			res.append("\n");
		}
		res.append(" - - - - - - RECTANGLE - - - - - - \n");
		res.append("Rectangle: " + RECT.size() + " -> ");
		for(Integer[] r: RECT){
			res.append("[" + r[0] + ", " + r[1] + "]");
		}
		
		return res.toString();
	}
}
