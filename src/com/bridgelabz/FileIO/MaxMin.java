package com.bridgelabz.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MaxMin {

	public static void main(String[] args)  {
		String strWrite="";
		int a[]= {5,2,3,6,7,1,8,0};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0 ;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
				
			}
			if(max<a[i]) {
				max=a[i];
				
			}
			
		}
		System.out.println(" The Min Value is : "+min+" and the max value is : "+max);
		strWrite=" The Min Value is : "+min+" and the max value is : "+max;
		try {
		File file=new File("C:\\Users\\Rawan\\git\\BridgelabzSlot2\\src\\com\\bridgelabz\\TextFiles\\MinMax");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(strWrite);
		bufferedWriter.close();
		System.out.println("Write successfully");
	}  catch(IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	}

}
