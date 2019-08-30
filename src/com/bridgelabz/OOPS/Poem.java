package com.bridgelabz.OOPS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.RegularExpressionsUtility;

public class Poem {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		RegularExpressionsUtility utility = new RegularExpressionsUtility();
		
		java.io.File  file= new File("/home/user/git/BridgelabzSlot2/src/com/bridgelabz/TextFiles/OldMcDonald");
		
		FileReader fileReader=new FileReader(file);
	
		
		BufferedReader bufferReader =new BufferedReader(fileReader);
		
		String str="";
		//str1 = bufferReader.readLine();
		try {
			
				str=str+bufferReader.readLine();
			
			  
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
	
		System.out.println("Select From the Option Below\n"
				+ "a. Chicks ­ chick\n"
				+ "b. Cat ­meow, meow\n" + 
				"c. Duck ­ quack \n"
				+ "d. Mule ­ Heehaw\n" + 
				"e. Turkey ­ gobble \n"
				+ "f. Dog ­ bow wow\n" + 
				"g. Pig ­ oink, oink\n"
				+ "h. Turtle ­ nerp, nerp\n" + 
				"i. Cow ­ moo, moo");
		
		
     char userinput=scanner.next().charAt(0);
		
		switch (userinput) {
		case 'a':
			utility.Lyric(str,"Chicks", "chick");
			break;
		case 'b':
			utility.Lyric(str,"Duck", "quack");
			break;
		case 'c':
			utility.Lyric(str,"Turkey", "gobble");
			break;
		case 'd':
			utility.Lyric(str,"Pig", "oink");
			break;
		case 'e':
			utility.Lyric(str,"Cow", "moo");
			break;
		case 'f':
			utility.Lyric(str,"Cat", "meow");
			break;
		case 'g':
			utility.Lyric(str,"Mule", "Heehaw");
			break;
		case 'h':
			utility.Lyric(str,"Dog", "bow");
			break;
		case 'i':
			utility.Lyric(str,"Turtle", "nerp");
			break;
		default:
			System.out.println("Select proper input");
			break;
		}
		scanner.close();
		
	}
	}

