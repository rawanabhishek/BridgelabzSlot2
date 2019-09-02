package com.bridgelabz.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.StatsUtility;

public class Stats {

	public static void main(String[] args) throws IOException {
		    StatsUtility utility =new StatsUtility();
           FileReader file =new FileReader("C:\\Users\\Rawan\\git\\BridgelabzSlot2\\src\\com\\bridgelabz\\TextFiles\\statsinput");
           BufferedReader br=new BufferedReader(file);
           String str="";
           try {
   			
				str=str+br.readLine();
			
			  
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
          // String a[]=new String[str.length()];
           
           String[] stringArray = str.split(",");
   		double[] arr = Arrays.stream(stringArray).mapToDouble(Double::parseDouble).toArray();
   		
   		System.out.println("MEAN :" + StatsUtility.mean(arr));
   		System.out.println("VARIANCE :" + utility.variance(arr));
   		System.out.println("STANDARD DEVIATION :" + utility.standardDeviation(arr));
   		System.out.println("MEDIAN :" + StatsUtility.median(arr));
	}

}
