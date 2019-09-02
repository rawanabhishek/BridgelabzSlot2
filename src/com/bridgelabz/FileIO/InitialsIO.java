package com.bridgelabz.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.PatternUtility;

public class InitialsIO {

	public static void main(String[] args) throws IOException {
	 	PatternUtility utility=new PatternUtility();
		FileReader file=new FileReader("C:\\Users\\Rawan\\git\\BridgelabzSlot2\\src\\com\\bridgelabz\\TextFiles\\initialinput");
		BufferedReader bufferedreader=new BufferedReader(file);
		String str="";
		try {
   			
			str=bufferedreader.readLine();
		
		  
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		bufferedreader.close();
	
char inital=str.charAt(0);

   switch(inital) {
   case 'k':
	   utility.initials(inital);
	   break;
   case 'd':
	   utility.initials(inital);
	   break;
   case 'w':
	   utility.initials(inital);
	   break;
	   
   }
	

}}
