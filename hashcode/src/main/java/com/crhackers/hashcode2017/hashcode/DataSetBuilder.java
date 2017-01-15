package com.crhackers.hashcode2017.hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.crhackers.hashcode2017.utility.Utility;

public class DataSetBuilder {

	public String pizza[][];
	public int row;
	public int col;
	public int low;
	public int high;
	public List<Integer[]> rect;
	
	private String path;
	
	public DataSetBuilder setInputFile(String nPath){
		path = nPath;
		return this;
	}
	
	public DataSet build() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path));
		String header = br.readLine();
		String[] metaInfo = header.split(" ");
		row = Integer.parseInt(metaInfo[0]);
		col = Integer.parseInt(metaInfo[1]);
		low = Integer.parseInt(metaInfo[2]);
		high = Integer.parseInt(metaInfo[3]);
		
		pizza = new String[row][col];
		String line;
		int count = 0;
		while((line = br.readLine()) != null){
			String l[] = line.split("");
			pizza[count++] = l;
		}
		br.close();
		
		rect = Utility.calculateRectangle(low*2, high);
		return new DataSet(this);
	}

}
