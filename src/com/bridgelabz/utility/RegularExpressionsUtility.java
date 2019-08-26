package com.bridgelabz.utility;

import java.text.DateFormat;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularExpressionsUtility {

	public static void Lyric(String str, String Animal, String Sound) {
		// String tempStr="";
		// tempString=str.replaceAll(%ANIMAL%, Animal);
		String replaceString = str.replaceAll("%ANIMAL%", Animal);
		String replaceString2 = replaceString.replaceAll("%SOUND%", Sound);

		System.out.println(replaceString2);
	}

	public  static void paragraph(String str , String name , String fullname ) {
		DateFormat format =new SimpleDateFormat( "dd/MM/yyyy");
		Date date = new Date();
		String replaceString=str.replaceAll("<<name>>", name);
		
		String replaceString2=replaceString.replaceAll("<<full name>>", fullname);
		String replaceString3=replaceString2.replaceAll("91­xxxxxxxxxx", "9869353231");
		String replaceString4=replaceString3.replaceAll("01/01/2016",format.format(date));
		
		System.out.println(replaceString4);
	}

}
