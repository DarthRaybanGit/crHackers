package com.crhackers.hashcode2017.hashcode;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello ALE!!" );
        DataSetBuilder dataSetBuilder = new DataSetBuilder();
        DataSet dataSet;
        try {
			dataSet = dataSetBuilder.setInputFile("small.in")
									.build();
			System.out.println(dataSet);
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
        
        
    }
}
